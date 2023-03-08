package segundoParcial.fila1.ej2;

import java.util.ArrayList;
import java.util.List;

public class ConcreteChat implements IChat{
    private List<Persona> listaChat = new ArrayList<>();

    public void addToChat(Persona persona){
        listaChat.add(persona);
    }
    @Override
    public void send(String msg, String tipoMensaje, Persona persona1) {
        if (tipoMensaje.equals("grupal") && persona1.getTipoPersona().equals("estudiante")){
            for (Persona persona:listaChat){
                persona.received(msg);
            }
        } else if (tipoMensaje.equals("docente") && persona1.getTipoPersona().equals("estudiante")) {
            for (Persona persona:listaChat){
                if (persona.getTipoPersona().equals("docente")){
                    persona.received(msg);
                }
            }
        } else if (tipoMensaje.equals("administrativo") && persona1.getTipoPersona().equals("estudiante")) {
            for (Persona persona:listaChat){
                if (persona.getTipoPersona().equals("administrativo")){
                    persona.received(msg);
                }
            }
        } else if (tipoMensaje.equals("docente") && persona1.getTipoPersona().equals("docente")) {
            for (Persona persona:listaChat){
                if (persona.getTipoPersona().equals("docente")){
                    persona.received(msg);
                }
            }
        } else if (tipoMensaje.equals("estudiante") && persona1.getTipoPersona().equals("docente")) {
            for (Persona persona:listaChat){
                if (persona.getTipoPersona().equals("estudiante")){
                    persona.received(msg);
                }
            }
        } else if (tipoMensaje.equals("grupal") && persona1.getTipoPersona().equals("administrativo")) {
            for (Persona persona:listaChat){
                persona.received(msg);
            }
        }
    }
}
