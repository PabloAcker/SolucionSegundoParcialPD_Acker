package segundoParcial.fila1.ej5;

import java.util.Random;

public class Prendido implements IEstado{
    @Override
    public void celBehavior(Celular celular) throws InterruptedException {
        System.out.println("El celular esta encendido");
        celular.setProgramasAbiertos(new Random().nextInt(10));
        System.out.println("Programas abiertos: " + celular.getProgramasAbiertos());
        System.out.println("Uso de memoria RAM: "+celular.getMemoriaRAM());
        int consumoActual = celular.getConsumoCPU();
        while (consumoActual < 100){
            Thread.sleep(5000);
            consumoActual = consumoActual + celular.getProgramasAbiertos()*5;
            celular.setConsumoCPU(consumoActual);
            System.out.println("Uso de recursos: "+celular.getConsumoCPU()+"%");
        }
        System.out.println("Los recursos ya llegaron y/o sobrepasaron el 100%");
        System.out.println("============================================");
    }
}
