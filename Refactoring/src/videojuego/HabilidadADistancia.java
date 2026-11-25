package videojuego;

public class HabilidadADistancia implements TipoHabilidad {

    @Override
    public double calcularDaño(double dañoBase) {
        return dañoBase * 1.5;
    }

    @Override
    public String getNombre() {
        return "habilidad a distancia";
    }

    @Override
    public String getDescripcion() {
        return "Esta habilidad aumenta tu fuerza un 50%";
    }
}
