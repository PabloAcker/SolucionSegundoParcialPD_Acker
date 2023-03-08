package segundoParcial.fila1.ej4;

import java.util.Comparator;
import java.util.List;

public class Estrategia3Categoria implements IStrategy{
    @Override
    public void ordenar(List<Libro> libroList) {
        // Ordena en orden alfabetico comparando las categorias de los libros
        libroList.sort(Comparator.comparing(Libro::getCategoria));
        for(Libro libro: libroList){
            libro.showInfoLibro();
        }
    }
}
