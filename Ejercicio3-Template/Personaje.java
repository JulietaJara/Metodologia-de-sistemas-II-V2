
public abstract class Personaje {

    protected String nombre;
    protected int nivel;
    protected int vida;
    protected int defensa;

    public Personaje(String nombre, int nivel, int vida, int defensa) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.defensa = defensa;
    }

    // Template Method
    public final void combatir(Enemigo enemigo) {

        if (vida <= 0 || !enemigo.estaVivo()) {
            System.out.println("No se puede iniciar el combate.");
            return;
        }

        System.out.println("\n=== COMBATE DE " + nombre.toUpperCase() + " ===");

        prepararCombate();
        posicionarse();
        ejecutarAtaque(enemigo);
        evaluarResultado(enemigo);
        despuesDelCombate();
    }

    protected abstract void prepararCombate();

    protected abstract void posicionarse();

    protected abstract void ejecutarAtaque(Enemigo enemigo);

    protected void evaluarResultado(Enemigo enemigo) {

        System.out.println("\n--- Resultado del combate ---");
        System.out.println(nombre + " tiene " + vida + " puntos de vida.");
        System.out.println(enemigo.getNombre() + " tiene "
                + enemigo.getVida() + " puntos de vida.");

        if (!enemigo.estaVivo()) {
            System.out.println(nombre + " ha ganado el combate.");
        } else if (vida <= 0) {
            System.out.println(nombre + " ha sido derrotado.");
        } else {
            System.out.println("El combate continúa.");
        }
    }

    // Hook
    protected void despuesDelCombate() {
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
