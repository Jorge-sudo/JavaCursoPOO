package ManejoExcepciones;

//Extendemos de la clase padre que es "Exception" L a cual nos obligara a crear un try y catch
//En cmabio si extendemos de runTimeException no nos obliga A un try y catch

public class OperadorExcepcion extends Exception {
    public OperadorExcepcion(String mensaje){
        super(mensaje);//Recibimos un mensaje y lo enviamos a la clase padre que es exception
    }
}
