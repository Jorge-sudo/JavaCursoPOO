package JavaBeans;


public class testJavaBeans {
    public static void main(String[] args) {
        //Es necesario implementar la interfaz "Serializable" e importarlo, en la clase Persona
        //Para que el objeto creado pueda moverse de servidor a servidor en 0 y 1
        Persona persona=new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        
        System.out.println(persona);
        System.out.println(" Nombre = "+ persona.getNombre());
        System.out.println(" Apellido = "+persona.getApellido());
    }
}
