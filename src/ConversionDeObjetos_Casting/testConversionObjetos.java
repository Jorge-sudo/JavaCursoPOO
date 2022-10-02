package ConversionDeObjetos_Casting;

public class testConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("juan", 50000, TipoEscritura.MODERNO);
        System.out.println("empleado = " + empleado);
        
        System.out.println("Clase hija = "+empleado.obtenerDetalles());
        
        System.out.println("        //DOWCASTING");
                                //DOWCASTING
        //No podemos exceder al metodo de la clase Escritor "getTipoEscritura" porque solo existe en esa clase y no
        //en la clase padre, por eso vamos a convertir la variable empleado a tipo scritor para poder axceder a ello
        System.out.println(" Tipo empleado = "+((Escritor)empleado).getTipoEscritura());
        
        //Otra forma es declarando una variable de tipo escritor 
        Escritor escritor=(Escritor)empleado;
        escritor.getTipoEscritura();
        
        System.out.println("        //UPCASTING");
        
                                //UPCASTING
        //Ejemplo de upcasting
        System.out.println(" Tipo empleado = "+empleado.obtenerDetalles());
                             //De otra forma
        //En Upcasting no es necesario convertir la variable 
        Empleado empleado2 = escritor;
        empleado2.getNombre();
                                
    }
}
