package segundoParcial.fila1.ej5;

public class Celular {
    private int programasAbiertos;
    private String memoriaRAM;
    private int consumoCPU;
    private IEstado estado;

    public Celular(String memoriaRAM, IEstado estado) {
        this.memoriaRAM = memoriaRAM;
        this.estado = estado;
    }

    public int getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(int programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public String getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getConsumoCPU() {
        return consumoCPU;
    }

    public void setConsumoCPU(int consumoCPU) {
        this.consumoCPU = consumoCPU;
    }

    public IEstado getEstado() {
        return estado;
    }

    public void setEstado(IEstado estado) {
        this.estado = estado;
    }

    public void useCel() throws InterruptedException {
        this.estado.celBehavior(this);
    }
}
