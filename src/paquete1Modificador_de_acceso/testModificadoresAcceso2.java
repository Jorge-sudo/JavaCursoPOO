package paquete1Modificador_de_acceso;

public class testModificadoresAcceso2 {
    public static void main(String[] args) {
                    
                        //DEFAULT O PACKAGE
                        
        //En default solo se puede crear objetos dentro del paquete 
        Default_o_Package obj=new Default_o_Package();
        obj.atributoDefault = "cambio desde la prueba";
        System.out.println("Clase atributo Default = " + obj.atributoDefault);
        obj.metodoDefault();
        
        System.out.println("\n");
        
                        // PRIVATE
        
        //No podemos acceder a los atributos por que son privados pero si podemos con el metodo set y get.
        Private obj2=new Private("juan");
        obj2.setAtributoPrivado("Cambio valor de atributo");
        System.out.println("Atributo privado = "+ obj2.getAtributoPrivado());
    }
}
