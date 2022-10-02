
package ApiColecciones;

import java.util.*;

public class InterfazMap {
    public static void main(String[] args) {
        
                                //INTERFAZ MAP
        
        Map miMapa = new HashMap();
        
        //En este caso ya no utilizaremos el metodo "add"(Collection) si no el metodo "put" por que put es de "MAP"
        
        //"put(Llave, valor de llave)"
        //o "put(Termino, valor de termino)"
        
        //Tanto la llave como el termino puede ser de cualquier valor Object(String,int,boolean y ect)
        miMapa.put("valor1", "juan");
        miMapa.put("valor2", "jose");
        miMapa.put("valor3", "karla");
       
        //En este caso con "(String)" lo que hacemos es convertir a tipo String
        //por que "miMapa.get" nos devuelve un valor de tipo Object
        String elemento = (String)miMapa.get("valor1");
        System.out.println("elemento = " + elemento);
        
        
                //EN ESTE CASO UTILIZAMOS LA INTERFAZ COLLECTION
        
        //El metodo set solo nos imprimira la llave, no el valor de la llave
        imprimir(miMapa.keySet());//Como es un tipo set no se garantiza el orden
        
        //Ahora imprimiremos los valores
        imprimir(miMapa.values());
        
        
    }
    
          //Aqui se le debe poner lo mas generico osea la interfaz padre que es "Collection"
    public static void imprimir(Collection obj){
        System.out.println("\t\tMETODO IMPRIMIR");
    
        //Con el ciclo "for Each" normal
        for(Object mes: obj){
            System.out.println("mes = " + mes);
        }
        
        System.out.println("\n");
        
        //Utilizamos una operacion funcional de tipo "Es landa"
        obj.forEach((mes)->{
            System.out.println("Mes : "+mes); 
        });
    }
}
