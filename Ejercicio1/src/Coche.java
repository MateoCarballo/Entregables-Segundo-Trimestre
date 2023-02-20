public class Coche extends Vehiculo{

    public Coche(String marca, String modelo, String motorizacion, String fechaMatriculacion, String fechaEntradaConcesionario, int peso) {
        super(marca, modelo, motorizacion, fechaMatriculacion, fechaEntradaConcesionario, peso);
    }

    @Override
    public void setTipodeCarnet(String tipodeCarnet) {
        super.setTipodeCarnet("B");
    }
}