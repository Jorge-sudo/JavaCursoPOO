package forEach;

public class forEach {
    public static void main(String[] args) {
        //"forEach" es un for mejorado
        int edades[]={5,6,7,8};
        
        //Escojemos una variable del tipo del arreglo:despues tambien colocamos el nombre del arreglo
        for (int edad: edades) {
            System.out.println("edad = "+edad);
        }//Aclarar que si se trata de un arrelo y queremos ingresar al contador tendremos que utilizar
        //El clasico "for" ya no el forEach
        
              //AHORA HACEMOS UN EJEMPLO CON OBJETOS
        Persona personas[]={new Persona("juan"),new Persona("karla"), new Persona("Agustin")};
        for(Persona persona: personas){
            System.out.println("Persona= "+persona);
        }
    }
}
