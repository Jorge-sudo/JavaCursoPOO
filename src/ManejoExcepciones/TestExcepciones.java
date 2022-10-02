
package ManejoExcepciones;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            //En esta linea no podemos dividir 10/0 entonces nos manda una excepcion
            //Aqui inicializamos nuestra propia excepcion
            resultado = Aritmetica.division(10, 0);
            
            
        //Esta variable "e" puede ser cualquiera solo es la variable la cual se almacena la excepcion
        }catch(Exception e){
            System.out.println("Ocurrio un error");
            
            //Esto es para imprimir  la pila de execiones, ya que cuando hay una se genera muchas
            e.printStackTrace(System.out);//Con "System.out" imprimimos cul es la excepcion, pero no es necesario
            
            //Imprimimos el mensajes de nuestro metodo
            System.out.println(e.getMessage());
        //Este finale siempre se ejecutara si o si pero es opcional  
        }finally{
            System.out.println("Se reviso la divicion entre 0");
        }
        System.out.println("resultado = " + resultado);
        
                      
        System.out.println("\n");
                        //DOBLE CATCH
                        
        try{
            resultado = Aritmetica.division(10, 0);
        }catch(OperadorExcepcion e){
            System.out.println("Ocurrio un error de tipo operacion Excepcion");
            System.out.println(e.getMessage());
        }catch(Exception e){//Recordar que los catch se deben armar de menos generico a mas generico
            //Osea primero las clases hijas y al ultimo la clase padre que es "Exception"
            System.out.println("Ocurrio un error de tipo Excepcion generico");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Se reviso la divicion entre 0");
        }
        System.out.println("resultado = " + resultado);
    }
}
