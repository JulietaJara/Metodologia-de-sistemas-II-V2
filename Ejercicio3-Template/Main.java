

public class Main {

    public static void main(String[] args) {

        // Equipamiento del guerrero.
        Arma espada = new Arma("Espada", 20);
        Armadura armadura = new Armadura("Armadura de hierro", 15);

        Guerrero guerrero = new Guerrero(
                "Arthas",
                10,
                150,
                10,
                30,
                espada,
                armadura
        );

        // Equipamiento del mago.
        Arma baston = new Arma("Bastón mágico", 10);
        Hechizo bolaDeFuego = new Hechizo("Bola de fuego", 40, 20);

        Mago mago = new Mago(
                "Merlin",
                10,
                100,
                5,
                80,
                25,
                baston,
                bolaDeFuego
        );

        // Enemigos.
        Enemigo dragon1 = new Enemigo("Dragón", 100, 10);
        Enemigo dragon2 = new Enemigo("Dragón oscuro", 120, 15);

        // Ejecución de los combates.
        guerrero.combatir(dragon1);

        mago.combatir(dragon2);
    }
}
