package Entidades;

public class DietaComida {

    private int idDietaComida;
    private int idComida;
    private int idDieta;
    private String horario;
    private boolean estado;

    public DietaComida() {
    }

    public DietaComida(String horario, int idComida, int idDietaComida, int idDieta, boolean estado) {
        this.horario = horario;
        this.idComida = idComida;
        this.idDietaComida = idDietaComida;
        this.idDieta = idDieta;
        this.estado = estado;
    }

    public DietaComida(int idDieta, int idComida, String horario, boolean estado) {
        this.horario = horario;
        this.idComida = idComida;
        this.idDieta = idDieta;
        this.estado = estado;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getIdComida() {
        return idComida;
    }

    public void setIdComida(int idComida) {
        this.idComida = idComida;
    }

    public int getIdDietaComida() {
        return idDietaComida;
    }

    public void setIdDietaComida(int idDietaComida) {
        this.idDietaComida = idDietaComida;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DietaComida{" + "horario=" + horario + ", idComida=" + idComida + ", idDietaComida=" + idDietaComida + ", idDieta=" + idDieta + ", estado=" + estado + '}';
    }

}
