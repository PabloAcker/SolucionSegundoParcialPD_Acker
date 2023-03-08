package segundoParcial.fila1.ej3;

public class User implements IUser{
    private String tipoNotificacion;
    private String nombre;

    public User(String tipoNotificacion, String nombre) {
        this.tipoNotificacion = tipoNotificacion;
        this.nombre = nombre;
    }

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String msg) {
        System.out.println("El usuario con el nombre " + getNombre() + " recibio una notificacion de tipo: " + getTipoNotificacion() + "\n"+ msg);
        System.out.println("========================================");
    }
}
