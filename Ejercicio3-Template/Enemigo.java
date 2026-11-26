
public class Enemigo {

    private String nombre;
    private int vida;
    private int defensa;

    public Enemigo(String nombre, int vida, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.defensa = defensa;
    }

    public void recibirDano(int dano) {

        int danoReal = Math.max(0, dano - defensa);
        vida = Math.max(0, vida - danoReal);

        System.out.println(nombre + " recibió " + danoReal
                + " puntos de daño.");
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
