
package ClaseObject;

public class testClaseObject {
    public static void main(String[] args) {
        
        //Recordar que cuando utilizamos la palabra reservada "new" significa que nos dara una referencia por memoria 
        Empleado empleado1 = new Empleado("juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);
        
        //Aqui preguntaremos si los 2 objetos son iguales
        if(empleado1 == empleado2){
            System.out.println("Tienen la misma referencia  en memoria");
        }else{
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        
                //Pero ahora comprobaremos el contenido de los objetos
        //ya que aveces no es necesario preguntar la referencia de memoria 
        
        if (empleado1.equals(empleado2)) {
            System.out.println("Los objetos son iguales en contenido");
        }else{
            System.out.println("Los objetos son distintos en contenido");
        }
        
                //Este es otr metodo para comparar objetos
        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("El valor hashCode es igual: "+empleado1.hashCode()+" = "+empleado2.hashCode());
        }else{//No es importante el numero lo importannte es saber si son iguales o no 
            System.out.println("El valor hashCode es distinto: "+empleado1.hashCode()+" = "+empleado2.hashCode());
        }
        
        
    }
}
