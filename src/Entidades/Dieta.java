
package Entidades;

import java.time.LocalDate;

public class Dieta {

    private int idDieta;
    private Paciente paciente;
    private Comida comida;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private double pesoInicial;
    private double pesoBuscado;

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
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

    public double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public double getPesoBuscado() {
        return pesoBuscado;
    }

    public void setPesoBuscado(double pesoBuscado) {
        this.pesoBuscado = pesoBuscado;
    }

    public Dieta() {
    }

    public Dieta(int idDieta, Paciente paciente, Comida comida, LocalDate fechaInicial, LocalDate fechaFinal, double pesoInicial, double pesoBuscado) {
        this.idDieta = idDieta;
        this.paciente = paciente;
        this.comida = comida;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.pesoInicial = pesoInicial;
        this.pesoBuscado = pesoBuscado;
    }
}
