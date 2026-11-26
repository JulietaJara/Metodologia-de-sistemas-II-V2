
public class Mago extends Personaje {

    private int mana;
    private int poderMagico;
    private Arma baston;
    private Hechizo hechizo;

    public Mago(String nombre, int nivel, int vida, int defensa,
                int mana, int poderMagico, Arma baston,
                Hechizo hechizo) {

        super(nombre, nivel, vida, defensa);

        this.mana = mana;
        this.poderMagico = poderMagico;
        this.baston = baston;
        this.hechizo = hechizo;
    }

    @Override
    protected void prepararCombate() {

        System.out.println("El mago selecciona el hechizo: "
                + hechizo.getNombre());

        System.out.println("El mago prepara su bastón: "
                + baston.getNombre());

        System.out.println("El mago concentra energía mágica.");
    }

    @Override
    protected void posicionarse() {
        System.out.println("El mago mantiene distancia del enemigo.");
    }

    @Override
    protected void ejecutarAtaque(Enemigo enemigo) {

        if (mana < hechizo.getCostoMana()) {
            System.out.println("El mago no tiene suficiente maná.");
            return;
        }

        mana -= hechizo.getCostoMana();

        int dano = poderMagico
                + baston.getDano()
                + hechizo.getDano();

        System.out.println("El mago ejecuta un ataque mágico.");
        enemigo.recibirDano(dano);
    }

    @Override
    protected void despuesDelCombate() {
        mana = Math.min(100, mana + 10);
        System.out.println("El mago recupera 10 puntos de maná.");
    }
}
