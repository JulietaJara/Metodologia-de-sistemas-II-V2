package Ejercicio5.gestion;

import Ejercicio5.dominio.*;
import Ejercicio5.factory.*;
import Ejercicio5.servicios.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class GestorHeroes {

    private static final GestorHeroes instancia = new GestorHeroes();

    private final List<Heroe> heroes;
    private final List<Batalla> batallas;
    private final Map<String, FabricaHeroe> fabricas;

    private final ServicioConsulta servicioConsulta;
    private final ServicioReportes servicioReportes;

    private GestorHeroes() {

        heroes = new ArrayList<>();
        batallas = new ArrayList<>();
        fabricas = new HashMap<>();

        servicioConsulta = new ServicioConsulta();
        servicioReportes = new ServicioReportes();

        inicializarFabricas();
    }

    public static GestorHeroes getInstancia() {
        return instancia;
    }

    private void inicializarFabricas() {

        registrarFabrica(new FabricaGuerrero());
        registrarFabrica(new FabricaMago());
    }

    public void registrarFabrica(FabricaHeroe fabrica) {

        Objects.requireNonNull(fabrica);

        String tipo = fabrica.obtenerTipo().toUpperCase(Locale.ROOT);

        if (fabricas.containsKey(tipo)) {
            throw new IllegalArgumentException(
                    "Ya existe una fábrica registrada para ese tipo."
            );
        }

        fabricas.put(tipo, fabrica);
    }

    public Heroe reclutarHeroe(String tipo, DatosHeroe datos) {

        Objects.requireNonNull(tipo);
        Objects.requireNonNull(datos);

        String clave = tipo.toUpperCase(Locale.ROOT);

        FabricaHeroe fabrica = fabricas.get(clave);

        if (fabrica == null) {
            throw new IllegalArgumentException(
                    "No existe una fábrica registrada para el tipo: " + tipo
            );
        }

        Heroe nuevoHeroe = fabrica.crearHeroe(datos);

        heroes.add(nuevoHeroe);

        return nuevoHeroe;
    }

    public Guerrero reclutarGuerrero(DatosGuerrero datos) {

        return (Guerrero) reclutarHeroe("GUERRERO", datos);
    }

    public Mago reclutarMago(DatosMago datos) {

        return (Mago) reclutarHeroe("MAGO", datos);
    }

    public Optional<Guerrero> consultarMejorGuerrero() {

        return servicioConsulta.obtenerMejorGuerrero(heroes);
    }

    public void registrarBatalla(Batalla batalla) {

        batallas.add(Objects.requireNonNull(batalla));
    }

    public String generarReporteBatallas() {

        return servicioReportes.generarReporte(batallas);
    }
}