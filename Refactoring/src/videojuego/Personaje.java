package videojuego;

public class Personaje {

    private final String nombre;
    private final double daño;
    private TipoHabilidad tipoHabilidad;

    public Personaje(String nombre, double daño, TipoHabilidad tipoHabilidad) {
        this.nombre = nombre;
        this.daño = daño;
        this.tipoHabilidad = tipoHabilidad;
    }

    public double calcularDañoTotal() {
        return tipoHabilidad.calcularDaño(daño);
    }

    public String describirHabilidad() {
        return "Habilidad tipo " + tipoHabilidad.getNombre() + "\n"
                + tipoHabilidad.getDescripcion();
    }

    public String getNombre() {
        return nombre;
    }

    public double getDaño() {
        return daño;
    }

    public void setTipoHabilidad(TipoHabilidad tipoHabilidad) {
        this.tipoHabilidad = tipoHabilidad;
    }
}
