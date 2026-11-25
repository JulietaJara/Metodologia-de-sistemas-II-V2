package videojuego;

public class Main {

    public static void main(String[] args) {
        Videojuego juego = new Videojuego();

        Personaje merlin = new Personaje("Merlín", 40, new HabilidadMagica());
        Personaje conan = new Personaje("Conan", 70, new HabilidadCuerpoACuerpo());
        Personaje legolas = new Personaje("Legolas", 50, new HabilidadADistancia());

        juego.agregarPersonaje(merlin);
        juego.agregarPersonaje(conan);
        juego.agregarPersonaje(legolas);

        juego.imprimirInfo(merlin);
        System.out.println();
        juego.imprimirInfo(conan);
        System.out.println();
        juego.imprimirInfo(legolas);
        System.out.println();

        Personaje masFuerte = juego.personajeConMasDaño();
        System.out.println("Personaje con más daño: " + masFuerte.getNombre()
                + " (" + masFuerte.calcularDañoTotal() + ")");
    }
}
