package paquete2Modificador_de_acceso;

import paquete1Modificador_de_acceso.*;

public class testModificadoresAcceso {
    public static void main(String[] args) {
        
                                    //PUBLIC
        
        //Como podemos apreciar si se puede crear un objeto de la clase "public" por que es publico 
        Public obj=new Public();
        System.out.println("obj = " + obj.atributoPublico);
        obj.metodoPublico();

        System.out.println("\n");
        
                                    //PROTECTED
        
        //En el metodo protected no se le puede llamar por que esta protegido por lo cual 
        //Protected obj2=new Protected();
        //creamos una clase hija para poder llamarlo desde aqui creando un objeto 
        claseHija_Protected obj3=new claseHija_Protected();
        System.out.println("obj = " + obj3);
        
//La clase de tipo DEFAULT O PACKAGE no se podra ejecutar desde esta clase por que no permite clases de otro paquete 
     }
}
