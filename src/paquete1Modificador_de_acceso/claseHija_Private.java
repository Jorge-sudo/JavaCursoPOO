package paquete1Modificador_de_acceso;


//CON ESTA CLASE HIJA PODEMOS LEER EL METODO PROTECTED O MODIFICARLO 
public class claseHija_Private extends Private{
    public claseHija_Private(){
        super("publico");//Con este "super" llamamos al constructor publico de la clase "Private"
//        this.atributoPrivado=" Modificacion de atributo Private";
//        System.out.println("Atrubuto privado =" + this.atributoPrivado);
//        this.metodoPrivate();
    }
}
