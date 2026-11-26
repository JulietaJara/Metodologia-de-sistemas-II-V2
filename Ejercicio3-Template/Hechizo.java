
public class Hechizo {

    private String nombre;
    private int dano;
    private int costoMana;

    public Hechizo(String nombre, int dano, int costoMana) {
        this.nombre = nombre;
        this.dano = dano;
        this.costoMana = costoMana;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDano() {
        return dano;
    }

    public int getCostoMana() {
        return costoMana;
    }
}
