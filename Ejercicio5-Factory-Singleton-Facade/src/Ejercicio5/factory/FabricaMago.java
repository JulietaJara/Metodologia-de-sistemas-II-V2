package Ejercicio5.factory;

import Ejercicio5.dominio.DatosHeroe;
import Ejercicio5.dominio.DatosMago;
import Ejercicio5.dominio.Mago;

public class FabricaMago implements FabricaHeroe {

    @Override
    public String obtenerTipo() {
        return "MAGO";
    }

    @Override
    public Mago crearHeroe(DatosHeroe datos) {

        if (!(datos instanceof DatosMago)) {
            throw new IllegalArgumentException(
                    "Los datos proporcionados no corresponden a un mago."
            );
        }

        DatosMago datosMago = (DatosMago) datos;

        return new Mago(
                datosMago.getNombre(),
                datosMago.getApodo(),
                datosMago.getFechaCreacion(),
                datosMago.getReservaMana()
        );
    }
}