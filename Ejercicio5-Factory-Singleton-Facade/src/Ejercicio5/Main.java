package Ejercicio5;

import Ejercicio5.cliente.Gremio;
import Ejercicio5.dominio.Batalla;
import Ejercicio5.dominio.DatosGuerrero;
import Ejercicio5.dominio.DatosMago;
import Ejercicio5.dominio.Guerrero;
import Ejercicio5.dominio.Heroe;
import Ejercicio5.dominio.Mago;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Gremio gremio = new Gremio();

        // Crear los datos de los héroes.

        DatosGuerrero datosGuerrero1 = new DatosGuerrero(
                "Arthas",
                "El Paladín",
                LocalDate.now(),
                150.0,
                10,
                5.0
        );

        DatosGuerrero datosGuerrero2 = new DatosGuerrero(
                "Garen",
                "El Justiciero",
                LocalDate.now(),
                200.0,
                15,
                8.0
        );

        DatosMago datosMago = new DatosMago(
                "Merlín",
                "El Sabio",
                LocalDate.now(),
                500.0
        );

        // Reclutar héroes mediante el gremio.

        Guerrero guerrero1 = gremio.reclutarGuerrero(datosGuerrero1);
        Guerrero guerrero2 = gremio.reclutarGuerrero(datosGuerrero2);

        Mago mago = gremio.reclutarMago(datosMago);

        System.out.println("Héroes reclutados correctamente.");

        // Consultar al mejor guerrero.

        Optional<Guerrero> mejorGuerrero = gremio.consultarMejorGuerrero();

        if (mejorGuerrero.isPresent()) {

            System.out.println(
                    "Mejor guerrero: "
                    + mejorGuerrero.get().getApodo()
            );

            System.out.println(
                    "Poder de ataque: "
                    + mejorGuerrero.get().getPoderAtaque()
            );

        } else {

            System.out.println("No hay guerreros registrados.");
        }

        // Registrar una batalla.

        Batalla batalla = new Batalla(
                LocalDate.now(),
                Arrays.<Heroe>asList(guerrero1, guerrero2, mago),
                guerrero2
        );

        gremio.registrarBatalla(batalla);

        // Generar el reporte.

        System.out.println();
        System.out.println(gremio.solicitarReporteBatallas());
    }
}