package ManejoDeBloques;

public class PurebaPersona {
    public static void main(String[] args) {
        Persona persona1=new Persona();
        System.out.println("persona1 = " + persona1);
        
        System.out.println("");
        
        //Al momento de crear este segundo objeto vermos que el bloque estatico ya no se ejecuta
        //por que solo se ejecuta una vez en camcio los demas se ejecutan con toda normalidad
        Persona persona2=new Persona();
        System.out.println("persona2 = " + persona2);
    }
}
