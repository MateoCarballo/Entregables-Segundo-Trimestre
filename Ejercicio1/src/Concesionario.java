public class Concesionario extends Empresa{
    int totaldeVehiculos;
    int facturacion;

    public Concesionario(String nombreEmpresa, String cif, String cuentaSS, String url, String razonSocial, String direccionPostal, String numeroTelefono1, String emailcorporativo1, String ip1, int totaldeVehiculos, int facturacion) {
        super(nombreEmpresa, cif, cuentaSS, url, razonSocial, direccionPostal, numeroTelefono1, emailcorporativo1, ip1);
        this.totaldeVehiculos = totaldeVehiculos;
        this.facturacion = facturacion;
    }
}
