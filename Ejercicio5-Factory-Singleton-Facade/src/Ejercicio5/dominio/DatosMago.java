package Ejercicio5.dominio;

import java.time.LocalDate;

public class DatosMago extends DatosHeroe {

    private final double reservaMana;

    public DatosMago(String nombre, String apodo, LocalDate fechaCreacion,
                     double reservaMana) {

        super(nombre, apodo, fechaCreacion);

        this.reservaMana = reservaMana;
    }

    public double getReservaMana() {
        return reservaMana;
    }
}