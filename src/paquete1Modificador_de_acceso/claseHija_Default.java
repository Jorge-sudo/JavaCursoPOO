package paquete1Modificador_de_acceso;

//La clase hija puede modificar y mostrar los atributos o constructores ya que estamos dentro del mismo paquete
public class claseHija_Default extends Default_o_Package{
    public claseHija_Default(){
        super();//Con super llamamos al constructor PROTECTED de la clase padre ya que es la unica manera
        this.atributoDefault=" Modificacion de atributo Default";
        System.out.println("Atrubuto Default =" + this.atributoDefault);
        this.metodoDefault();
    }
}
