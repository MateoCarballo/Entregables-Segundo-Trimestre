package EjercicioConcesionario.Vehiculos;

public class Camion extends Vehiculo {

    int masaMaximaAutorizada;

    public Camion(String marca, String modelo, String combustible, String fechaMatriculacion, String fechaEntradaConcesionario, int precio, int peso, String matricula) {
        super(marca, modelo, combustible, fechaMatriculacion, fechaEntradaConcesionario, precio, peso, matricula);
        setearCampos();
    }

    private void setearCampos() {
        setTipodeCarnet("C");
    }

    @Override
    public void setTipodeCarnet(String tipodeCarnet) {
        super.setTipodeCarnet("C");
    }

    @Override
    public void setCombustible(String combustible){
        super.setCombustible("Diesel");
    }

    public void setMasaMaximaAutorizada(int masaMaximaAutorizada) {
        this.masaMaximaAutorizada = masaMaximaAutorizada;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "masaMaximaAutorizada=" + masaMaximaAutorizada +
                '}';
    }
}
