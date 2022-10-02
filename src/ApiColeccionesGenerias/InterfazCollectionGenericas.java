package ApiColeccionesGenerias;

import java.util.*;

public class InterfazCollectionGenericas {
    public static void main(String[] args) {
        
        //Aqui en List indicamos que utilizaremos el tipo String
        //Aqui en ArrayList solo se pone la notacion de diamante <> vacio no se necesita determinar el tipo
        List<String> miLista = new ArrayList();
        
        //Con add ya no almacenaremos de tipo object sinos con tipo "String"
        //Lo ideal es determinar que tipo sera en este caso "String"
        miLista.add("Lunes"); 
        miLista.add("Martes");
        miLista.add("Miercoles");
        //El metodo add viene de la interfaz padre llamada "Collection" y esta interfaz es hija.
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        //En este metodo si se puede duplicar elementos 
        
        //Ya no tenemos que convertir  "miLista" a un tipo String por que ya esta definido 
        //Como es como un vector al momento de imprimir determinamos que posicion imprimir en este caso "0"
        String elemento = miLista.get(0);
        imprimir(miLista);
        
                            
//                                //Ciclo for Each
//        //Aqui imprimimos con forEach variable = imprimira : Array = miLista
//        for(Object lista: miLista){
//            System.out.println(" Dia : "+ lista);
//        }
//        
//        System.out.println("\n");
//        
//        
//                                //Funcion Eslanda
//        //Funcion Eslanda En este forEach no hay que especificar de que tipo es la variable sinos que es automatico
//        miLista.forEach((lista) -> {
//            System.out.println(" Dia : "+ lista);
//        });
//        
//        
//        System.out.println("\n");
        
        
                             //AHORA VEREMOS COMO COVERTIR TIPO SET A GENERICO
                //Como set no guarda un orden sus operaciones son mas rapidas
                                
        //Esta interfaz a diferencia del "list", no se respeta el orden en la que fue agregado los elementos 
        Set<String> miSet = new HashSet<>();
        
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
        
        
        
                               //INTERFAZ MAP CONVERTIMOS EN GENERICO
        
        //String=llave string=valor
        Map<String, String> miMapa = new HashMap<>();
        
        //En este caso ya no utilizaremos el metodo "add"(Collection) si no el metodo "put" por que put es de "MAP"
        
        //"put(Llave, valor de llave)"
        //o "put(Termino, valor de termino)"
        
        //Tanto la llave como el termino puede ser de cualquier valor Object(String,int,boolean y ect)
        miMapa.put("valor1", "juan");
        miMapa.put("valor2", "jose");
        miMapa.put("valor3", "karla");//En este caso hay dos valores repetidos
        miMapa.put("valor3", "Carlos");//valor3=carlos por que es el ultimo y karla se borrara
       
        //En este caso con "(String)" lo que hacemos es convertir a tipo String
        //por que "miMapa.get" nos devuelve un valor de tipo Object
        String elementoMapa = miMapa.get("valor1");
        System.out.println("elemento = " + elementoMapa);
        
            //Como el metodo es de tipo "String" y "miMapa" tambien entonces es compatible
        //El metodo set solo nos imprimira la llave, no el valor de la llave
        imprimir(miMapa.keySet());//Como es un tipo set no se garantiza el orden
        
        //Ahora imprimiremos los valores
        imprimir(miMapa.values());
        
    }
    
    
    
    
          //Aqui se le debe poner lo mas generico osea la interfaz padre que es "Collection"
    //Aqui en collection tambien determinamos el tipo en este caso solo trabajara con un tipo "String"
    public static void imprimir(Collection<String> obj){
        System.out.println("\t\tMETODO IMPRIMIR");
    
        //Con el ciclo "for Each" normal
        for(String mes: obj){
            System.out.println("elemento = " + mes);
        }//La variable mes ya es de tipo string
        
        System.out.println("\n");
//        
//        //Utilizamos una operacion funcional de tipo "Es landa"
//        obj.forEach((mes)->{
//            System.out.println("elemento : "+mes); 
//        });
    }
}
