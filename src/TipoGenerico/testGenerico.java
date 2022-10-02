package TipoGenerico;


public class testGenerico {
    public static void main(String[] args) {
        //Definimos el tipo "Integer" que es de tipo entero
        ClaseGenerica<Integer> objetoint = new ClaseGenerica(15);
        System.out.println("objetoint = " + objetoint);
        objetoint.obtenerTipo();
        //Primero indicar un tipo compatible 
        //Luego indicar el tipo en este caso tipo "String"
        //Mandar el atributo "jose" en este caso tambien debe ser String
        ClaseGenerica<String> objetoString = new ClaseGenerica("jose");
        objetoString.obtenerTipo();
    }
}
