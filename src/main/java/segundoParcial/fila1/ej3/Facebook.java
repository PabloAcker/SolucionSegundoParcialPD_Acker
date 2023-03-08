package segundoParcial.fila1.ej3;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements IFacebook{
    private List<User> subs = new ArrayList<>();

    public Facebook() {}

    public void sendNotification(String tipo, String msg){
        this.notificarSubs(msg, tipo);
    }

    @Override
    public void subscribir(User user) {
        subs.add(user);
    }

    @Override
    public void borrar(User user) {
        subs.remove(user);
    }

    @Override
    public void notificarSubs(String msg, String tipo) {
        if(tipo.equals("video")){
            for(User user: subs){
                if(user.getTipoNotificacion().equals("video")){
                    user.update(msg);
                }
            }
        } else if (tipo.equals("imagen")) {
            for (User user: subs){
                if (user.getTipoNotificacion().equals("imagen")){
                     user.update(msg);
                }
            }
        }
    }
}
