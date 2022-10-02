package paquete2Modificador_de_acceso;

import paquete1Modificador_de_acceso.Protected;

//CON ESTA CLASE HIJA PODEMOS LEER EL METODO PROTECTED O MODIFICARLO 
public class claseHija_Protected extends Protected{
    public claseHija_Protected(){
        super();//Con super llamamos al constructor PROTECTED de la clase padre ya que es la unica manera
        this.atributoProtected=" Modificacion de atributo protected";
        System.out.println("Atrubuto protegido =" + this.atributoProtected);
        this.metodoProtected();
    }
}
