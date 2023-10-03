
package Entidades;


public class Comida {
    
    private int idComida;
    private String nombre;
    private String detalle;
    private double calXgr;                             

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getCalXgr() {
        return calXgr;
    }

    public void setCalXgr(int calXgr) {
        this.calXgr = calXgr;
    }

    public Comida(String nombre, String detalle, int calXgr) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.calXgr = calXgr;
    }

    public Comida() {
    }

    public Comida(int idComida, String nombre, String detalle, int calXgr) {
        this.idComida = idComida;
        this.nombre = nombre;
        this.detalle = detalle;
        this.calXgr = calXgr;
    }
    
    
}
