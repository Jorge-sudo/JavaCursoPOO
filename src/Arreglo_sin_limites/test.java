package Arreglo_sin_limites;

public class test {
                            //AQUI ESTAMOS DEFINIENDO UN ARREGLO CON LA CANTIDAD INDEFINIDA 
    //A diferencia del [] habia que poner un limite pero con "..."no hay limite 
    private static void imprimirNumeros(int...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(" elemento = " +  numeros[i]);
        }//Imprimimos y como se puede ver tambien podemos utilizar length(largo) del vector
    }
    
    //En este caso el "int..." debe ser el ultimo metodo definido no el primero por que nos marcaria error 
     private static void variosParametros(String nombre, int...numeros){
         System.out.println("nombre = " + nombre);
         imprimirNumeros(numeros);//Vemos tambien que nos acepta la variable por que tambien es indefinido
     }
    
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2);
        variosParametros("juan", 8,99,10);
    }
}
