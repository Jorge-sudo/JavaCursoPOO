package SobreEscritura;

public class textPrueba {
    public static void main(String[] args) {
        claseHija_Gerente gerente=new claseHija_Gerente("juan", 5000.0,"Sistemas");
        //Al momento de imprimir departamento no se imprime por que no esta en el metodo "obtener detalles"
        //De la clase padre pero si esta en de la clase hija asi que se imprimira normal 
        System.out.println("Gerente: "+gerente.obtenerDetalles());

    }
}
