package segundoParcial.fila1.ej2;

public class Estudiante extends Persona{
    private String nombre;
    private String ci;

    public Estudiante(IChat mediator) {
        super(mediator);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public void send(String msg, String tipoMensaje) {
        mediator.send(msg, tipoMensaje, this);
    }

    @Override
    public void received(String msg) {
        System.out.println("El mensaje fue recibido exitosamente por el estudiante "+getNombre()+"\n"+msg);
    }
}
