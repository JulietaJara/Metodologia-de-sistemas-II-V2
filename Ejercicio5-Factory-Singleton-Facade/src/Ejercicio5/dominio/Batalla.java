package Ejercicio5.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Batalla {

    private final LocalDate fecha;
    private final List<Heroe> participantes;
    private final Heroe ganador;

    public Batalla(LocalDate fecha, List<Heroe> participantes, Heroe ganador) {

        this.fecha = Objects.requireNonNull(fecha);
        this.ganador = Objects.requireNonNull(ganador);

        Objects.requireNonNull(participantes);

        if (participantes.isEmpty()) {
            throw new IllegalArgumentException(
                    "La batalla debe tener al menos un participante."
            );
        }

        if (!participantes.contains(ganador)) {
            throw new IllegalArgumentException(
                    "El ganador debe formar parte de los participantes."
            );
        }

        this.participantes = Collections.unmodifiableList(
                new ArrayList<>(participantes)
        );
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public List<Heroe> getParticipantes() {
        return participantes;
    }

    public Heroe getGanador() {
        return ganador;
    }
}