package ApiColecciones;

import java.util.*;

public class InterfazCollection {
    public static void main(String[] args) {
        
                        //VEMOS LA INTERFAZ SET Y LA CLASE ARRAY LIST
            //Como los elementos son ordenados sus operaciones pueden ser mas lentas
        
        //List y ArrayList los importamos son interfaces, con la cual se pueden crear objetos de tipo Array
        List miLista = new ArrayList();
        //Aqui podemos agregar cualquier objeto
        
        //Esta lista se imprimiera ala orden la cual se agrega, en cambio los set y get no es asi
        miLista.add("Lunes");//No hay restrinccion de cuantos elementos agregaremos a esta lista 
        miLista.add("Martes");
        miLista.add("Miercoles");
        //El metodo add viene de la interfaz padre llamada "Collection" y esta interfaz es hija.
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        //En este metodo si se puede duplicar elementos 
        
                            
                                //Ciclo for Each
        //Aqui imprimimos con forEach variable = imprimira : Array = miLista
        for(Object lista: miLista){
            System.out.println(" Dia : "+ lista);
        }
        
        System.out.println("\n");
        
        
                                //Funcion Eslanda
        //Funcion Eslanda En este forEach no hay que especificar de que tipo es la variable sinos que es automatico
        miLista.forEach((lista) -> {
            System.out.println(" Dia : "+ lista);
        });
        
        
        System.out.println("\n");
        
        
                             //AHORA VEREMOS LA INTERFAZ SET Y CLASE HASH SET
                //Como set no guarda un orden sus operaciones son mas rapidas
                                
        //Esta interfaz a diferencia del "list", no se respeta el orden en la que fue agregado los elementos 
        Set miSet = new HashSet();
        
        //El metodo add viene de la interfaz padre llamada "Collection" y esta interfaz es hija.
        miSet.add("Enero");
        miSet.add("Febrero");//Tambien puede ser de tipo int y otros.
        miSet.add("Marzo");
        miSet.add("Abril");
        miSet.add("Mayo");
        miSet.add("Junio");
        miSet.add("Julio");
        miSet.add("Agosto");
        miSet.add("Septiembre");
        miSet.add("Octubre");
        miSet.add("Noviembre");
        miSet.add("Diciembre");
        //En este metodo no se puede duplicar elementos, si lo haces se desecha el elemento duplicado
        
        imprimir(miSet);
        
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
