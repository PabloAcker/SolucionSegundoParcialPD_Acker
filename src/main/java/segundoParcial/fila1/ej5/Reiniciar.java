package segundoParcial.fila1.ej5;

public class Reiniciar implements IEstado{
    @Override
    public void celBehavior(Celular celular) {
        celular.setProgramasAbiertos(0);
        celular.setConsumoCPU(0);
        System.out.println("EL celular esta reiniciando");
        System.out.println("Programas abiertos: " + celular.getProgramasAbiertos());
        System.out.println("Uso de recursos: "+celular.getConsumoCPU()+"%");
        System.out.println("Uso de memoria RAM: "+celular.getMemoriaRAM());
        System.out.println("============================================");
    }
}
