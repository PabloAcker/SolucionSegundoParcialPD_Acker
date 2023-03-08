package segundoParcial.fila1.ej4;

public class Main {
    public static void main(String[] args) {
        BDD bdd = new BDD(new Estrategia1ID());

        Libro libro1 = new Libro("11111", "Harry Potter", "CienciaFiccion");
        Libro libro2 = new Libro("33333", "Pep Guardiola", "Deportes");
        Libro libro3 = new Libro("22222", "La historia de Bolivia", "Cultura");
        Libro libro4 = new Libro("77777", "Los juegos del Hambre", "Accion");
        Libro libro5 = new Libro("55555", "Metamorfosis", "CienciaFiccion");

        bdd.addLibros(libro1);
        bdd.addLibros(libro2);
        bdd.addLibros(libro3);
        bdd.addLibros(libro4);
        bdd.addLibros(libro5);

        System.out.println("Iniciando el ordenamiento por ID>>>>>");
        System.out.println("[Orden de menor a mayor ID]");
        bdd.ordenarListaLibros();
        System.out.println(" \n ======================================= \n");

        bdd.setStrategy(new Estrategia2Titulo());
        System.out.println("Iniciando el ordenamiento por Titulo>>>>>");
        System.out.println("[Orden alfabetico en el titulo]");
        bdd.ordenarListaLibros();
        System.out.println(" \n ======================================= \n");

        bdd.setStrategy(new Estrategia3Categoria());
        System.out.println("Iniciando el ordenamiento por Categoria>>>>>");
        System.out.println("[Orden alfabetico en la categoria]");
        bdd.ordenarListaLibros();
        System.out.println(" \n ======================================= \n");
    }
}
