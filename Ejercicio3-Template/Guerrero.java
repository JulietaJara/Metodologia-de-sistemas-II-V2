public class Guerrero extends Personaje {

    private int fuerza;
    private Arma arma;
    private Armadura armadura;

    public Guerrero(String nombre, int nivel, int vida, int defensa,
                    int fuerza, Arma arma, Armadura armadura) {

        super(nombre, nivel, vida, defensa);

        this.fuerza = fuerza;
        this.arma = arma;
        this.armadura = armadura;
    }

    @Override
    protected void prepararCombate() {

        System.out.println("El guerrero prepara su arma: "
                + arma.getNombre());

        System.out.println("El guerrero equipa su armadura: "
                + armadura.getNombre());
    }

    @Override
    protected void posicionarse() {
        System.out.println("El guerrero se acerca al enemigo.");
    }

    @Override
    protected void ejecutarAtaque(Enemigo enemigo) {

        int dano = fuerza + arma.getDano();

        System.out.println("El guerrero ejecuta un ataque físico.");
        enemigo.recibirDano(dano);
    }

    @Override
    protected void despuesDelCombate() {
        System.out.println("El guerrero guarda su arma.");
    }
}
