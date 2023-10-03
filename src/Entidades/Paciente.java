package Entidades;

public class Paciente {

    private int idPaciente;
    private int dni;
    private String apellido;
    private String nombre;
    private String domicilio;
    private int celular;
    private double pesoActual;
    private double pesoDeseado;
    private boolean estado;

    public Paciente() {
    }

    public Paciente(int dni, String apellido, String nombre, String domicilio, int celular) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.celular = celular;
    }

    public Paciente(int dni, String apellido, String nombre, String domicilio, int celular, double pesoActual, double pesoDeseado, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.celular = celular;
        this.pesoActual = pesoActual;
        this.pesoDeseado = pesoDeseado;
        this.estado = estado;
    }

    public Paciente(int idPaciente, int dni, String apellido, String nombre, String domicilio, int celular, double pesoActual, double pesoDeseado, boolean estado) {
        this.idPaciente = idPaciente;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.celular = celular;
        this.pesoActual = pesoActual;
        this.pesoDeseado = pesoDeseado;
        this.estado = estado;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public double getPesoDeseado() {
        return pesoDeseado;
    }

    public void setPesoDeseado(double pesoDeseado) {
        this.pesoDeseado = pesoDeseado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paciente{" + "idPaciente=" + idPaciente + ", dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", domicilio=" + domicilio + ", celular=" + celular + ", pesoActual=" + pesoActual + ", pesoDeseado=" + pesoDeseado + ", estado=" + estado + '}';
    }

    

}
