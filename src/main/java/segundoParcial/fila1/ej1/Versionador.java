package segundoParcial.fila1.ej1;

public class Versionador {
    private Documento state;
    public void guardarCambio(Documento state){
        System.out.println("Guardando version del documento..." + state.getState());
        this.state = state;
    }

    public Memento createCambio() {
        return new Memento(state);
    }

    public Documento revertirCambio(Memento memento) {
        this.state = memento.getState();
        return state;
    }
}
