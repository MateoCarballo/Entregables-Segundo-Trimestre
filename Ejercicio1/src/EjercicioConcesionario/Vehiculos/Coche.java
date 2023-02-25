package EjercicioConcesionario.Vehiculos;

public class Coche extends Vehiculo {
    byte numerodePuertas;

    public Coche(String marca, String modelo, String combustible, String fechaMatriculacion,
                 String fechaEntradaConcesionario, int precio, int peso,String matricula) {
        super(marca, modelo, combustible, fechaMatriculacion,
                fechaEntradaConcesionario, precio, peso, matricula);
        setearCampos();
    }

    private void setearCampos() {
        setTipodeCarnet("B");
    }

    @Override
    public void setTipodeCarnet(String tipodeCarnet) {
        super.setTipodeCarnet("B");
    }

    public void setNumerodePuertas(byte numerodePuertas) {
        this.numerodePuertas = numerodePuertas;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "numerodePuertas=" + numerodePuertas +
                '}';
    }
}