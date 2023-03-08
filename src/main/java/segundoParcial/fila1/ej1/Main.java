package segundoParcial.fila1.ej1;

public class Main {
    public static void main(String[] args) {
        Controlador caretaker = new Controlador();
        Versionador originator = new Versionador();
        Documento documento;

        documento = new Documento("Caratula", "Primer Cambio");
        originator.guardarCambio(documento);
        caretaker.addVersion(originator.createCambio());

        documento = new Documento("Primer Titulo", "Segundo Cambio");
        originator.guardarCambio(documento);
        caretaker.addVersion(originator.createCambio());

        documento = new Documento("Descripcion", "Tercer Cambio");
        originator.guardarCambio(documento);
        caretaker.addVersion(originator.createCambio());

        documento = new Documento("Conclusion", "Cuarto Cambio");
        originator.guardarCambio(documento);
        caretaker.addVersion(originator.createCambio());

        //============================================
        int numeroCambios = 4;

        System.out.println("Mostrando la opcion ctrl+z >>>>>>>>>>");
        documento = originator.revertirCambio(caretaker.getVersion(numeroCambios - 2));
        documento.showInfoDoc();

        documento = originator.revertirCambio(caretaker.getVersion(numeroCambios - 1));
        documento.showInfoDoc();

        documento = originator.revertirCambio(caretaker.getVersion(numeroCambios));
        documento.showInfoDoc();

        System.out.println("Mostrando la opcion ctrl+y >>>>>>>>>>");

        documento = originator.revertirCambio(caretaker.getVersion(numeroCambios - 1));
        documento.showInfoDoc();

        documento = originator.revertirCambio(caretaker.getVersion(numeroCambios - 2));
        documento.showInfoDoc();

        documento = originator.revertirCambio(caretaker.getVersion(numeroCambios - 3));
        documento.showInfoDoc();

    }
}
