package segundoParcial.fila1.ej4;

import java.util.Comparator;
import java.util.List;

public class Estrategia1ID implements IStrategy{
    @Override
    public void ordenar(List<Libro> libroList) {
        // Ordena de menor a mayor comparando los ID de los libros
        libroList.sort(Comparator.comparing(Libro::getId));
        for(Libro libro: libroList){
            libro.showInfoLibro();
        }
    }
}
