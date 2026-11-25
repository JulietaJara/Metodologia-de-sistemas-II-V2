package Ejercicio5.factory;

import Ejercicio5.dominio.DatosHeroe;
import Ejercicio5.dominio.Heroe;

public interface FabricaHeroe {

    String obtenerTipo();

    Heroe crearHeroe(DatosHeroe datos);
}
