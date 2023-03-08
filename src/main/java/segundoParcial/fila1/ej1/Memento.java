package segundoParcial.fila1.ej1;

public class Memento {
    private Documento state;

    public Memento(Documento state) {
        this.state = state;
    }
    public Documento getState(){
        return state;
    }
}
