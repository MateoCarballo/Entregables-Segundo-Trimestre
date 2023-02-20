public class Vehiculo {
    private String marca;
    private String modelo;
    private String motorizacion;
    private String fechaMatriculacion;
    private String fechaEntradaConcesionario;

    private String tipodeCarnet;
    private int peso;

    public Vehiculo(String marca, String modelo, String motorizacion, String fechaMatriculacion, String fechaEntradaConcesionario, int peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.motorizacion = motorizacion;
        this.fechaMatriculacion = fechaMatriculacion;
        this.fechaEntradaConcesionario = fechaEntradaConcesionario;
        this.peso = peso;
    }

    public void setTipodeCarnet(String tipodeCarnet) {
        this.tipodeCarnet = tipodeCarnet;
    }
}
