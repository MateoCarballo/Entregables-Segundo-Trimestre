package EjercicioConcesionario.Vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String combustible;
    private String fechaMatriculacion;
    private String fechaEntradaConcesionario;

    private int precio;
    private String tipodeCarnet;
    private int peso;

    private String matricula;

    boolean esFurgoneta;
    public Vehiculo(){

    }

    public Vehiculo(String marca, String modelo, String combustible, String fechaMatriculacion, String fechaEntradaConcesionario, String entradaConcesionario, int precio, int peso, String matricula){

    }

    public Vehiculo(String marca, String modelo, String combustible, String fechaMatriculacion, String fechaEntradaConcesionario, int precio, int peso, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.fechaMatriculacion = fechaMatriculacion;
        this.fechaEntradaConcesionario = fechaEntradaConcesionario;
        this.precio = precio;
        this.peso = peso;
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setTipodeCarnet(String tipodeCarnet) {
        this.tipodeCarnet = tipodeCarnet;
    }

    public void setCombustible(String combustible) {this.combustible = combustible;}

    public String getMatricula() {
        return matricula;
    }

    public String getTipodeCarnet() {
        return tipodeCarnet;
    }

    public boolean isEsFurgoneta() {
        return esFurgoneta;
    }

    public void setEsFurgoneta(boolean esFurgoneta) {
        this.esFurgoneta = esFurgoneta;
    }

    @Override
    public String toString() {

        String codigoColor = "\u001B[31m";
        String marcaColoreada = marca.replace(marca, codigoColor + marca + "\u001B[0m");

        return "Vehiculo{" +
                "marca='" + marcaColoreada + '\n' +
                ", modelo='" + modelo + '\n' +
                ", combustible='" + combustible + '\n' +
                ", fechaMatriculacion='" + fechaMatriculacion + '\n' +
                ", fechaEntradaConcesionario='" + fechaEntradaConcesionario + '\n' +
                ", precio=" + precio +'\n'+
                ", tipodeCarnet='" + tipodeCarnet + '\n' +
                ", peso=" + peso +'\n'+
                ", matricula='" + matricula + '\'';






    }
}
