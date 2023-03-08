package segundoParcial.fila1.ej1;

import java.util.ArrayList;
import java.util.List;

public class Controlador {

    private List<Memento> stateList = new ArrayList<>();
    public void addVersion(Memento memento){
        stateList.add(memento);
    }
    public Memento getVersion(int numeroCambios){
        return stateList.get(stateList.size() - numeroCambios);
    }
}
