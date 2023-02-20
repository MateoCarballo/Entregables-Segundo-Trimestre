package Vehiculos;

public class Coche extends Vehiculo {
    byte numerodePuertas;


    public Coche(String marca, String modelo, String combustible, String fechaMatriculacion, String fechaEntradaConcesionario, int precio, int peso) { ,
        super(marca, modelo, combustible, fechaMatriculacion, precio, peso);
    }

    @Override
    public void setTipodeCarnet(String tipodeCarnet) {
        super.setTipodeCarnet("B");
    }

    public byte getNumerodePuertas() {
        return numerodePuertas;
    }

    public void setNumerodePuertas(byte numerodePuertas) {
        this.numerodePuertas = numerodePuertas;
    }

}