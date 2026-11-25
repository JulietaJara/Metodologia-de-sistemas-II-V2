package Ejercicio5.dominio;

import java.time.LocalDate;

public class Mago extends Heroe {

    private final double reservaMana;

    public Mago(String nombre, String apodo, LocalDate fechaCreacion,
                double reservaMana) {

        super(nombre, apodo, fechaCreacion);

        this.reservaMana = reservaMana;
    }

    public double getReservaMana() {
        return reservaMana;
    }
}