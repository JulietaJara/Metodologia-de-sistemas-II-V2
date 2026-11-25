package Ejercicio5.factory;

import Ejercicio5.dominio.DatosGuerrero;
import Ejercicio5.dominio.DatosHeroe;
import Ejercicio5.dominio.Guerrero;
import Ejercicio5.dominio.Heroe;

public class FabricaGuerrero implements FabricaHeroe {

    @Override
    public String obtenerTipo() {
        return "GUERRERO";
    }

    @Override
    public Guerrero crearHeroe(DatosHeroe datos) {

        if (!(datos instanceof DatosGuerrero)) {
            throw new IllegalArgumentException(
                    "Los datos proporcionados no corresponden a un guerrero."
            );
        }

        DatosGuerrero datosGuerrero = (DatosGuerrero) datos;

        return new Guerrero(
                datosGuerrero.getNombre(),
                datosGuerrero.getApodo(),
                datosGuerrero.getFechaCreacion(),
                datosGuerrero.getPoderAtaque(),
                datosGuerrero.getVictorias(),
                datosGuerrero.getBonoPorVictoria()
        );
    }
}