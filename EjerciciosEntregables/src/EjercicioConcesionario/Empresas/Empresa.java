package EjercicioConcesionario.Empresas;

public class Empresa {
    private String nombreEmpresa;
    private String cif;
    private String cuentaSS;
    private String url;
    private String razonSocial;
    private String direccionPostal;
    private String numeroTelefono1;
    private String emailcorporativo1;
    private String ip1;

    Empresa(String nombreEmpresa, String cif, String cuentaSS, String url, String razonSocial, String direccionPostal, String numeroTelefono1, String emailcorporativo1, String ip1) {
        this.nombreEmpresa = nombreEmpresa;
        this.cif = cif;
        this.cuentaSS = cuentaSS;
        this.url = url;
        this.razonSocial = razonSocial;
        this.direccionPostal = direccionPostal;
        this.numeroTelefono1 = numeroTelefono1;
        this.emailcorporativo1 = emailcorporativo1;
        this.ip1 = ip1;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", cif='" + cif + '\'' +
                ", cuentaSS='" + cuentaSS + '\'' +
                ", url='" + url + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", direccionPostal='" + direccionPostal + '\'' +
                ", numeroTelefono1='" + numeroTelefono1 + '\'' +
                ", emailcorporativo1='" + emailcorporativo1 + '\'' +
                ", ip1='" + ip1 + '\'' +
                '}';
    }
}
