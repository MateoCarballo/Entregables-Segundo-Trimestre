public class Furgoneta extends Coche{

    public Furgoneta(String marca, String modelo, String motorizacion, String fechaMatriculacion, String fechaEntradaConcesionario, int peso) {
        super(marca, modelo, motorizacion, fechaMatriculacion, fechaEntradaConcesionario, peso);
    }
    @Override
    public void setTipodeCarnet(String tipodeCarnet) {
        super.setTipodeCarnet("B");
    }
}
