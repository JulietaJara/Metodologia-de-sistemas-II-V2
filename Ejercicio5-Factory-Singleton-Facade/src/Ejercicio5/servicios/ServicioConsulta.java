package Ejercicio5.servicios;

import Ejercicio5.dominio.Guerrero;
import Ejercicio5.dominio.Heroe;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ServicioConsulta {

    public Optional<Guerrero> obtenerMejorGuerrero(List<Heroe> heroes) {

        return heroes.stream()
                .filter(Guerrero.class::isInstance)
                .map(Guerrero.class::cast)
                .max(Comparator.comparingDouble(Guerrero::getPoderAtaque));
    }
}