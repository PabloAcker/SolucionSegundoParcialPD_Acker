package segundoParcial.fila1.ej2;

public class Administrativo extends Persona{
    private String nombre;
    private String cargo;
    public Administrativo(IChat mediator) {
        super(mediator);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void send(String msg, String tipoMensaje) {
        mediator.send(msg, tipoMensaje, this);
    }

    @Override
    public void received(String msg) {
        System.out.println("El mensaje fue recibido exitosamente por el Administrativo "+getNombre()+" con el cargo: "+getCargo()+"\n"+msg);
    }
}
