package data;

import java.util.Objects;

public class Gasto {

    private String gGasto;
    private String gDescripcion;
    private String gCategoria;
    private String gMes;
    private String gAno;

    public Gasto(String gGasto, String gDescripcion, String gCategoria, String gMes, String gAno) throws IllegalArgumentException{
        if (gGasto != null && gDescripcion != null && gCategoria != null && gMes != null && gAno != null) {
            this.gGasto = gGasto;
            this.gDescripcion = gDescripcion;
            this.gCategoria = gCategoria;
            this.gMes = gMes;
            this.gAno = gAno;
        }else{
            throw new IllegalArgumentException("Parametros nulos");
        }
        
    }

    public String getgGasto() {
        return gGasto;
    }

    public void setgGasto(String gGasto) {
        this.gGasto = gGasto;
    }

    public String getgDescripcion() {
        return gDescripcion;
    }

    public void setgDescripcion(String gDescripcion) {
        this.gDescripcion = gDescripcion;
    }

    public String getgCategoria() {
        return gCategoria;
    }

    public void setgCategoria(String gCategoria) {
        this.gCategoria = gCategoria;
    }

    public String getgMes() {
        return gMes;
    }

    public void setgMes(String gMes) {
        this.gMes = gMes;
    }

    public String getgAno() {
        return gAno;
    }

    public void setgAno(String gAno) {
        this.gAno = gAno;
    }

    @Override
    public boolean equals(Object obj) {
        Gasto g = (Gasto)obj;
        if (this.gGasto == g.gGasto && this.gDescripcion == g.gDescripcion && this.gCategoria == g.gCategoria && this.gMes == g.gMes && this.gAno == g.gAno) {
            return true;
        }
        return true;
    }
    
    

}
