package segundoParcial.fila1.ej1;

public class Documento {
    private String nuevoCambio;
    private String state;

    public Documento(String nuevoCambio, String state) {
        this.nuevoCambio = nuevoCambio;
        this.state = state;
    }

    public String getNuevoCambio() {
        return nuevoCambio;
    }

    public void setNuevoCambio(String nuevoCambio) {
        this.nuevoCambio = nuevoCambio;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public void showInfoDoc(){
        System.out.println(getNuevoCambio());
    }
}
