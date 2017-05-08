package data;

public class Perfil {

    private String pUsuario;
    private String pEdas;
    private String pOcupacion;
    private String pCiudad;
    private String pCorreo;

    public Perfil(String pUsuario, String pEdas, String pOcupacion, String pCiudad, String pCorreo) {
        this.pUsuario = pUsuario;
        this.pEdas = pEdas;
        this.pOcupacion = pOcupacion;
        this.pCiudad = pCiudad;
        this.pCorreo = pCorreo;
    }

    public String getpUsuario() {
        return pUsuario;
    }

    public void setpUsuario(String pUsuario) {
        this.pUsuario = pUsuario;
    }

    public String getpEdas() {
        return pEdas;
    }

    public void setpEdas(String pEdas) {
        this.pEdas = pEdas;
    }

    public String getpOcupacion() {
        return pOcupacion;
    }

    public void setpOcupacion(String pOcupacion) {
        this.pOcupacion = pOcupacion;
    }

    public String getpCiudad() {
        return pCiudad;
    }

    public void setpCiudad(String pCiudad) {
        this.pCiudad = pCiudad;
    }

    public String getpCorreo() {
        return pCorreo;
    }

    public void setpCorreo(String pCorreo) {
        this.pCorreo = pCorreo;
    }

}
