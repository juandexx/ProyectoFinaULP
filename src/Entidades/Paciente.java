package Entidades;

public class Paciente implements Comparable<Paciente> {

    private int idPaciente;
    private String nombre;
    private String apellido;
    private int dni;
    private double pesoActual;
    private int edad;
    private String domicilio;
    private int celular;
    private boolean estado;

    public Paciente(int idPaciente, String nombre, String apellido, int dni, double pesoActual, int edad, String domicilio, int celular, boolean estado) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pesoActual = pesoActual;
        this.edad = edad;
        this.domicilio = domicilio;
        this.celular = celular;
        this.estado = estado;
    }

    public Paciente(String nombre, String apellido, int dni, double pesoActual, int edad, String domicilio, int celular, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pesoActual = pesoActual;
        this.edad = edad;
        this.domicilio = domicilio;
        this.celular = celular;
        this.estado = estado;
    }

    public Paciente() {
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paciente{" + "idPaciente=" + idPaciente + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", pesoActual=" + pesoActual + ", edad=" + edad + ", domicilio=" + domicilio + ", celular=" + celular + ", estado=" + estado + '}';
    }

    @Override
    public int compareTo(Paciente t) {
        if (dni == t.dni) {
            return 0;
        } else if (dni > t.dni) {
            return 1;
        } else {
            return -1;
        }
    }

}
