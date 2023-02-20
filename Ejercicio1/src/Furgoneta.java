public class Furgoneta extends Coche{

    boolean puertaLateralCorredera;


    public Furgoneta(String marca, String modelo, String combustible, String fechaMatriculacion, String fechaEntradaConcesionario, int peso) {
        super(marca, modelo, combustible, fechaMatriculacion, fechaEntradaConcesionario, peso);
    }
    @Override
    public void setTipodeCarnet(String tipodeCarnet) {
        super.setTipodeCarnet("B");
    }
}
