package Autoboxing_Unboxing;

public class Autoboxing_Unboxing {
    public static void main(String[] args) {
        //Clases envolventes de tipos primitivos 
        /*
        int = Integer
        long = Long
        float = Float
        double = Double
        boolean = Boolean
        byte = Byte
        char = Character
        short = Short
        */
        
                //Autoboxing
        
        //Integer es un tipo "object"
        Integer entero = 10;
        System.out.println("entero = " + entero);
        //Aqui nos imprime una cadena con la cual podemos hacer concatenaciones
        //El dato se puede convertir enves del "toString" a un tipo String, double, float y etc.
        System.out.println("entero = " + entero.doubleValue());
        
        
                //Unboxing es la inversa de Autoboxing
           //Esta variable ya no es un tipo objet
        int entero2=entero;
        System.out.println("entero2 = " + entero2);
    }
}
