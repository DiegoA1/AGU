package data;

import java.util.Objects;

public class Perfil {

    private String pUsuario;
    private String pEdad;
    private String pOcupacion;
    private String pCiudad;
    private String pCorreo;

    public Perfil(String pUsuario, String pEdad, String pOcupacion, String pCiudad, String pCorreo) throws IllegalArgumentException{
        if (pUsuario != null && pEdad != null && pOcupacion != null && pCiudad != null && pCorreo != null) {
            this.pUsuario = pUsuario;
            this.pEdad = pEdad;
            this.pOcupacion = pOcupacion;
            this.pCiudad = pCiudad;
            this.pCorreo = pCorreo;
         }else{
            throw new IllegalArgumentException("Parametros nulos");
        }
    }

    public String getpUsuario() {
        return pUsuario;
    }

    public void setpUsuario(String pUsuario) {
        this.pUsuario = pUsuario;
    }

    public String getpEdad() {
        return pEdad;
    }

    public void setpEdad(String pEdad) {
        this.pEdad = pEdad;
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
    
    @Override
    public boolean equals(Object obj) {
        Perfil p = (Perfil)obj;
        if (this.pUsuario == p.pUsuario && this.pEdad == p.pEdad && this.pOcupacion == p.pOcupacion && this.pCiudad == p.pCiudad && this.pCorreo == p.pCorreo) {
            return true;
        }
        return true;
    }
    
    

}
