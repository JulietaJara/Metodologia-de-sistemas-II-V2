package Ejercicio5.dominio;

import java.time.LocalDate;
import java.util.Objects;

public abstract class DatosHeroe {

    private final String nombre;
    private final String apodo;
    private final LocalDate fechaCreacion;

    public DatosHeroe(String nombre, String apodo, LocalDate fechaCreacion) {
        this.nombre = Objects.requireNonNull(nombre);
        this.apodo = Objects.requireNonNull(apodo);
        this.fechaCreacion = Objects.requireNonNull(fechaCreacion);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
}