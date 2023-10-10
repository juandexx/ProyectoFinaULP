package Entidades;

import java.time.LocalDate;

public class Dieta {

    private int idDieta;
    private String nombre;
    private Paciente paciente;
    private Comida comida;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private double pesoActual;
    private double pesoFinal;
    private boolean estado;

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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
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

    public Dieta() {
    }

    public Dieta(int idDieta, String nombre, Paciente paciente, Comida comida, LocalDate fechaInicial, LocalDate fechaFinal, double pesoActual, double pesoFinal, boolean estado) {
        this.idDieta = idDieta;
        this.nombre = nombre;
        this.paciente = paciente;
        this.comida = comida;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoActual = pesoActual;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
    }

    public Dieta(String nombre, Paciente paciente, Comida comida, LocalDate fechaInicial, LocalDate fechaFinal, double pesoActual, double pesoFinal, boolean estado) {
        this.nombre = nombre;
        this.paciente = paciente;
        this.comida = comida;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoActual = pesoActual;
        this.pesoFinal = pesoFinal;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dieta{" + "idDieta=" + idDieta + ", nombre=" + nombre + ", paciente=" + paciente + ", comida=" + comida + ", fechaInicial=" + fechaInicial + ", fechaFinal=" + fechaFinal + ", pesoActual=" + pesoActual + ", pesoFinal=" + pesoFinal + ", estado=" + estado + '}';
    }
           
}
