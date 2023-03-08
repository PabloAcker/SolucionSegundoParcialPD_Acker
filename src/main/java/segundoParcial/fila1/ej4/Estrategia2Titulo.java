package segundoParcial.fila1.ej4;

import java.util.Comparator;
import java.util.List;

public class Estrategia2Titulo implements IStrategy{
    @Override
    public void ordenar(List<Libro> libroList) {
        // Ordena en orden alfabetico comparando los titulos de los libros
        libroList.sort(Comparator.comparing(Libro::getTitulo));
        for(Libro libro: libroList){
            libro.showInfoLibro();
        }
    }
}
