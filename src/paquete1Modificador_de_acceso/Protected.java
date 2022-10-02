package paquete1Modificador_de_acceso;
    
    //PROTECTED NO ESTA A NIVEL DE CLASE PERO SI DE ATRIBUTO
public class Protected {
    //El protected solo se puede utilizar desde clases hijas o padre
    //Tambien recordar que no se puede utilizar desde paquetes externos solo internos
    protected String atributoProtected = "Valor protected";
    
    //COMO EL CONSTRUCTOR ES PROTECTED NO PODEMOS CREAR UN OBJETO POR QUE ESTA PROTEJIDO 
    protected Protected(){
        System.out.println("Constructor protected");
    }
    
    //PARA PODER CREAR UN OBJETO CREAMOS UN CONSTRUCTOR PUBLICO CON UN ARGUMENTO
    public Protected(String arg){
        System.out.println("Constructor publico");
    }
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
}
