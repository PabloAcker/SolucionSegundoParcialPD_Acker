package segundoParcial.fila1.ej3;

public class Main {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        facebook.subscribir(new User("video", "Ema"));
        facebook.subscribir(new User("imagen", "Nico"));
        facebook.subscribir(new User("video", "Charlie"));
        facebook.subscribir(new User("imagen", "Lagu"));
        facebook.subscribir(new User("video", "Rene"));

        facebook.sendNotification("video", "Ibai Llanos acaba de subir un nuevo video!");
        facebook.sendNotification("imagen", "Cristiano Ronaldo acaba de subir una nueva foto!");

    }
}
