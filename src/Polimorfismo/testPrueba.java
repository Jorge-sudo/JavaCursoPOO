package Polimorfismo;


public class testPrueba {
    public static void main(String[] args) {
        //POLIMORFISMO significa multiplos comportamientos
        Empleado empleado=new Empleado("Juan", 5000);
        System.out.println(" Empleado = "+ empleado.obtenerDetalles());
        
        claseHija_Gerente gerente=new claseHija_Gerente("Jose",1000,"Contabilidad");
        System.out.println(" Gerente = "+gerente.obtenerDetalles());
        
        System.out.println("\n");
        
        //Tanto como empleado y gerente se imprimira normal por que los dos estan enlazados
    }
    
                    //AQUI ES DONDE SE APLICA EL POLIMORFISMO
    
    //Ojo aclarar que los metodos deben ser del mismo modificador 
    //por ejemplo protected y la clase hija debe ser protected no debe ser mas restrictivo como private 
    //Como variable se pone la clase padre, pero las subclases como gerente es compatible con Empleado 
    
    //El metodo obtenerDetalles esta en la clase padre y hija es por eso que se puede ejecutar el metodo imprimir 
    
}
