package paquete1Modificador_de_acceso;

//Public nos quieres decir que podemos utilizar esta clase desde cualquier paquete externo o interno
public class Public {
    public String atributoPublico = "Valor atributo publico";
    
    //Esto de public es igual aplica para los constructures 
    public Public(){
        System.out.println("Constructor publico");
    }
    //Igual un metodo es acsesible desde otra clase o paquete 
    public void metodoPublico(){
        System.out.println("Metodo publico");
    }
    
    
//        DEFAULT NO PUEDE SER MODIFICADO FUERA DEL PAQUETE 
//    Solo podra ser utilizada dentro del paquete
    
}
