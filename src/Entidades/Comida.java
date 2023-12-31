package Entidades;

public class Comida implements Comparable<Comida> {

    private int idComida;
    private String nombre;
    private String detalle;
    private int cantCalorias;
    private boolean estado;

    public Comida(int idComida, String nombre, String detalle, int cantCalorias, boolean estado) {
        this.idComida = idComida;
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCalorias = cantCalorias;
        this.estado = estado;
    }

    public Comida(String nombre, String detalle, int cantCalorias, boolean estado) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCalorias = cantCalorias;
        this.estado = estado;
    }

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

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Comida(String nombre, String detalle, int cantCalorias) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantCalorias = cantCalorias;
    }

    public Comida() {
    }

    @Override
    public String toString() {
        return "Comida{" + "idComida=" + idComida + ", nombre=" + nombre + ", detalle=" + detalle + ", cantCalorias=" + cantCalorias + ", estado=" + estado + '}';
    }

    @Override
    public int compareTo(Comida t) {
        if (idComida == t.idComida) {
            return 0;
        } else{
            return 1;
        }
    }
}
