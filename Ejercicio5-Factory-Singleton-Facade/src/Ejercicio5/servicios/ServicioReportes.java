package Ejercicio5.servicios;

import Ejercicio5.dominio.Batalla;
import Ejercicio5.dominio.Heroe;

import java.util.List;

public class ServicioReportes {

    public String generarReporte(List<Batalla> batallas) {

        if (batallas.isEmpty()) {
            return "No hay batallas registradas.";
        }

        StringBuilder reporte = new StringBuilder();

        reporte.append("===== REPORTE DE BATALLAS =====\n");

        for (Batalla batalla : batallas) {

            reporte.append("\nFecha: ")
                    .append(batalla.getFecha())
                    .append("\n");

            reporte.append("Participantes: ");

            for (Heroe heroe : batalla.getParticipantes()) {
                reporte.append(heroe.getApodo()).append(", ");
            }

            reporte.delete(reporte.length() - 2, reporte.length());

            reporte.append("\nGanador: ")
                    .append(batalla.getGanador().getApodo())
                    .append("\n");

            reporte.append("------------------------------\n");
        }

        return reporte.toString();
    }
}