package segundoParcial.fila1.ej2;

import segundoParcial.fila1.ej1.Documento;

public class Main {
    public static void main(String[] args) {
        ConcreteChat chat = new ConcreteChat();

        Estudiante e1 = new Estudiante(chat);
        e1.setTipoPersona("estudiante");
        e1.setNombre("Dylan");

        Estudiante e2 = new Estudiante(chat);
        e2.setTipoPersona("estudiante");
        e2.setNombre("Faby");

        //==================================

        Docente d1 = new Docente(chat);
        d1.setTipoPersona("docente");
        d1.setNombre("Eynar");

        Docente d2 = new Docente(chat);
        d2.setTipoPersona("docente");
        d2.setNombre("Paul");

        //==================================

        Administrativo a1 = new Administrativo(chat);
        a1.setTipoPersona("administrativo");
        a1.setNombre("Denise");
        a1.setCargo("Cajas");

        Administrativo a2 = new Administrativo(chat);
        a2.setTipoPersona("administrativo");
        a2.setNombre("Mario");
        a2.setCargo("Encargado de becas");

        chat.addToChat(e1);
        chat.addToChat(e2);
        chat.addToChat(d1);
        chat.addToChat(d2);
        chat.addToChat(a1);
        chat.addToChat(a2);

        //e1.send("Hola grupo, esto es para todos!!", "grupal");
        //e2.send("Como estan todos los administrativos?!", "administrativo");

        //d2.send("Como estan todos los estudiantes?!", "estudiante");

        a1.send("Hola a todoooos!!", "grupal");
    }
}
