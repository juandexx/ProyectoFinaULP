package Entidades;

import java.time.LocalDate;

public class Dieta {

    private int idDieta;
    private String nombre;
    private int idPaciente;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private double pesoActual;
    private double pesoFinal;
    private boolean estado;

    public Dieta(int idDieta, String nombre, int idPaciente, LocalDate fechaInicial, LocalDate fechaFinal, double pesoActual, double pesoFinal, boolean estado) {
        this.idDieta = idDieta;
        this.nombre = nombre;
        this.idPaciente = idPaciente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoActual = pesoActual;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
    }

    public Dieta(String nombre, int idPaciente, LocalDate fechaInicial, LocalDate fechaFinal, double pesoActual, double pesoFinal, boolean estado) {
        this.nombre = nombre;
        this.idPaciente = idPaciente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoActual = pesoActual;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
    }

    public Dieta() {
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public double getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(double pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dieta{" + "idDieta=" + idDieta + ", nombre=" + nombre + ", idPaciente=" + idPaciente + ", fechaInicial=" + fechaInicial + ", fechaFinal=" + fechaFinal + ", pesoActual=" + pesoActual + ", pesoFinal=" + pesoFinal + ", estado=" + estado + '}';
    }

}
