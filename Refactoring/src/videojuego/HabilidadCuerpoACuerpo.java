package videojuego;

public class HabilidadCuerpoACuerpo implements TipoHabilidad {

    @Override
    public double calcularDaño(double dañoBase) {
        return dañoBase;
    }

    @Override
    public String getNombre() {
        return "habilidad cuerpo a cuerpo";
    }

    @Override
    public String getDescripcion() {
        return "Esta habilidad mantiene tu fuerza";
    }
}
