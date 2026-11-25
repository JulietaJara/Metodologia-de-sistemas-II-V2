package videojuego;

import java.util.ArrayList;
import java.util.List;

public class Videojuego {

    private final List<Personaje> personajes = new ArrayList<>();

    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }

    public Personaje personajeConMasDaño() {
        Personaje masFuerte = null;
        double max = 0;

        for (Personaje p : personajes) {
            double daño = p.calcularDañoTotal();
            if (daño > max) {
                masFuerte = p;
                max = daño;
            }
        }
        return masFuerte;
    }

    public void imprimirInfo(Personaje p) {
        System.out.println(p.getNombre() + " tiene como daño " + p.getDaño());
        System.out.println(p.describirHabilidad());
    }
}
