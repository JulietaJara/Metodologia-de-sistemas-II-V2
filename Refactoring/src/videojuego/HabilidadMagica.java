package videojuego;

public class HabilidadMagica implements TipoHabilidad {

    @Override
    public double calcularDaño(double dañoBase) {
        return dañoBase * 2;
    }   
    @Override
    public String getNombre() {
        return "habilidad mágica";
    }

    @Override
    public String getDescripcion() {
        return "Esta habilidad dobla tu fuerza";
    }
}