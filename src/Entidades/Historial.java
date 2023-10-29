
package Entidades;

import java.time.LocalDate;

public class Historial {
    public int idHistorial;
    public int idPaciente;
    public double peso;
    public LocalDate fechaRegistro;

    public Historial() {
    }

    public Historial(int idHistorial, int idPaciente, double peso, LocalDate fechaRegistro) {
        this.idHistorial = idHistorial;
        this.idPaciente = idPaciente;
        this.peso = peso;
        this.fechaRegistro = fechaRegistro;
    }

    public Historial(int idPaciente, double peso, LocalDate fechaRegistro) {
        this.idPaciente = idPaciente;
        this.peso = peso;
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Historial{" + "idHistorial=" + idHistorial + ", idPaciente=" + idPaciente + ", peso=" + peso + ", fechaRegistro=" + fechaRegistro + '}';
    } 
    
}
