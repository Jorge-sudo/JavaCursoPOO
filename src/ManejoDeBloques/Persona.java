package ManejoDeBloques;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    
    //ESTE BLOQUE SOLO OPERARA 1 VEZ POR MAS QUE SE CREE 2 OBJETOS
    //Esta clase estatica se ejecutara antes del constructor 
    static{//ESTE ES UN BLOQUE 
        //Como este bloque es statico no podemos utilizar "this"
        System.out.println("Ejecucion bloque statico");
        Persona.contadorPersonas++;
        //idPersona = 10;//Esta variable no es statica por lo tanto no se permite su uso en este bloque
    }
    
    
    //ESTE BLOQUE VA SEGUIR OPERANDO SI SE CREA OTRO OBJETO 
    {
        System.out.println("Ejecucion de bloque no statico");
        this.idPersona=Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
