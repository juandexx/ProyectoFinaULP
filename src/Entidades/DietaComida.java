
package Entidades;

public class DietaComida {
    private Horario momento;
    private Comida comida;
    private int id;
    private Dieta dieta;

    public DietaComida(Horario momento, Comida comida, int id, Dieta dieta) {
        this.momento = momento;
        this.comida = comida;
        this.id = id;
        this.dieta = dieta;
    }

    public DietaComida(int id) {
        this.id = id;
    }

    public DietaComida() {
    }

    public Horario getMomento() {
        return momento;
    }

    public void setMomento(Horario momento) {
        this.momento = momento;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dieta getDieta() {
        return dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }
    
}
