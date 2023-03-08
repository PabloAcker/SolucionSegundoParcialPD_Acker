package segundoParcial.fila1.ej4;

import java.util.ArrayList;
import java.util.List;

public class BDD {
    private List<Libro> libros = new ArrayList<>();
    private IStrategy strategy;

    public BDD(IStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void addLibros(Libro libro){
        libros.add(libro);
    }
    public void ordenarListaLibros(){
        this.strategy.ordenar(libros);
    }
}
