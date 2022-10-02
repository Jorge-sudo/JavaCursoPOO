package ManejoExcepciones;

//Aqui creamos nuestras propias excepciones
public class Aritmetica {          //Aqui afirmamos con "throws" que posiblemente este metodo devuelva una excepcion
    public static int division (int numerador, int denominador) throws OperadorExcepcion{
        if (denominador == 0) {
            //Aqui reportamos la excepcion a la clase OperadorExcepcion que creamos  y le enviamos un mensaje
            throw new OperadorExcepcion("Division entre cero");
            //throw=arrojar esta excepcion
        }
        return numerador/denominador;
    }
    
}
