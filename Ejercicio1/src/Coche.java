public class Coche extends Vehiculo{
    byte numerodePuertas;


    public Coche(String marca, String modelo, String motorizacion, String fechaMatriculacion, String fechaEntradaConcesionario, int peso) {
        super(marca, modelo, motorizacion, fechaMatriculacion, fechaEntradaConcesionario, peso);
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