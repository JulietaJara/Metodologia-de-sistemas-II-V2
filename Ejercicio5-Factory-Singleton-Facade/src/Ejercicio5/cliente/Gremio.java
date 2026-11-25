package Ejercicio5.cliente;

import Ejercicio5.dominio.Batalla;
import Ejercicio5.dominio.DatosGuerrero;
import Ejercicio5.dominio.DatosHeroe;
import Ejercicio5.dominio.DatosMago;
import Ejercicio5.dominio.Guerrero;
import Ejercicio5.dominio.Heroe;
import Ejercicio5.dominio.Mago;
import Ejercicio5.gestion.GestorHeroes;

import java.util.Optional;

public class Gremio {

    private final GestorHeroes gestor;

    public Gremio() {

        gestor = GestorHeroes.getInstancia();
    }
    
    public Heroe reclutarHeroe(String tipo, DatosHeroe datos) {
    return gestor.reclutarHeroe(tipo, datos);
    }

    public Guerrero reclutarGuerrero(DatosGuerrero datos) {

        return gestor.reclutarGuerrero(datos);
    }

    public Mago reclutarMago(DatosMago datos) {

        return gestor.reclutarMago(datos);
    }

    public Optional<Guerrero> consultarMejorGuerrero() {

        return gestor.consultarMejorGuerrero();
    }

    public void registrarBatalla(Batalla batalla) {

        gestor.registrarBatalla(batalla);
    }

    public String solicitarReporteBatallas() {

        return gestor.generarReporteBatallas();
    }
}