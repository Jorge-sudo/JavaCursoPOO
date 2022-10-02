package paquete1Modificador_de_acceso;

    //LA CLASE DEFAULT O PACKAGE SOLO PUEDE SER UTILIZADA DENTRO DEL PAQUETE NO FUERA  

class Default_o_Package {
    protected String atributoDefault = "Valor atributo Default";
    
    //COMO EL CONSTRUCTOR ES PROTECTED NO PODEMOS CREAR UN OBJETO POR QUE ESTA PROTEJIDO 
    Default_o_Package(){
        System.out.println("Constructor Default");
    }
    
    void metodoDefault(){
        System.out.println("Metodo Default");
    }
}
