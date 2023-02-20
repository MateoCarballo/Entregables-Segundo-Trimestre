public class Vehiculo {
    private String marca;
    private String modelo;
    private String combustible;
    private String fechaMatriculacion;
    private String fechaEntradaConcesionario;

    private int precio;
    private String tipodeCarnet;
    private int peso;

    public Vehiculo(String marca, String modelo, String combustible, String fechaMatriculacion, String fechaEntradaConcesionario, int precio, int peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.fechaMatriculacion = fechaMatriculacion;
        this.fechaEntradaConcesionario = fechaEntradaConcesionario;
        this.precio = precio;
        this.peso = peso;
    }

    public void setTipodeCarnet(String tipodeCarnet) {
        this.tipodeCarnet = tipodeCarnet;
    }

    public void setCombustible(String combustible) {this.combustible = combustible;}
}
