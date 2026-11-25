import java.util.ArrayList;
import java.util.List;


interface Observador {
    void actualizar(Sensor sensor);
}


abstract class Sensor {
    private final String nombre;
    private final String unidad;
    private double valor;
    private final List<Observador> observadores = new ArrayList<>();

    protected Sensor(String nombre, String unidad) {
        this.nombre = nombre;
        this.unidad = unidad;
    }

    public void agregarObservador(Observador o) {
        if (!observadores.contains(o)) observadores.add(o);
    }

    public void quitarObservador(Observador o) {
        observadores.remove(o);
    }

    private void notificar() {
        for (Observador o : new ArrayList<>(observadores)) {
            o.actualizar(this);
        }
    }

   
    public void setValor(double nuevoValor) {
        this.valor = nuevoValor;
        notificar();
    }

    public String getNombre() { return nombre; }
    public String getUnidad() { return unidad; }
    public double getValor()  { return valor; }
}


class SensorTemperatura extends Sensor {
    public SensorTemperatura() { super("Temperatura", "°C"); }
}
class SensorHumedad extends Sensor {
    public SensorHumedad() { super("Humedad", "%"); }
}
class SensorCO2 extends Sensor {
    public SensorCO2() { super("CO2", "ppm"); }
}
class SensorLuminosidad extends Sensor {
    public SensorLuminosidad() { super("Luminosidad", "lux"); }
}


class PanelPrincipal implements Observador {
    @Override
    public void actualizar(Sensor s) {
        System.out.println("[PANEL PRINCIPAL] " + s.getNombre() + ": " + s.getValor() + " " + s.getUnidad());
    }
}

class PanelAlertas implements Observador {
    private final double umbral;
    public PanelAlertas(double umbral) { this.umbral = umbral; }

    @Override
    public void actualizar(Sensor s) {
        if (s.getValor() > umbral) {
            System.out.println("[ALERTA] " + s.getNombre() + " superó el umbral (" + umbral + "): "
                    + s.getValor() + " " + s.getUnidad());
        }
    }
}

class RegistroConsola implements Observador {
    @Override
    public void actualizar(Sensor s) {
        System.out.println("[LOG] Cambio detectado en " + s.getNombre() + " -> " + s.getValor());
    }
}


public class Main {
    public static void main(String[] args) {
        Sensor temp = new SensorTemperatura();
        Sensor co2  = new SensorCO2();

        Observador principal = new PanelPrincipal();
        Observador alertasTemp = new PanelAlertas(30);
        Observador alertasCo2  = new PanelAlertas(1000);
        Observador log = new RegistroConsola();

        
        temp.agregarObservador(principal);
        temp.agregarObservador(alertasTemp);
        temp.agregarObservador(log);
        co2.agregarObservador(principal);
        co2.agregarObservador(alertasCo2);

        System.out.println("--- Cambios con todo activo ---");
        temp.setValor(25);
        temp.setValor(35);
        co2.setValor(1200);

        
        temp.quitarObservador(log);
        System.out.println("--- Log desactivado ---");
        temp.setValor(28);
    }
}
