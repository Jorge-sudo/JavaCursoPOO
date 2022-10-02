
package Interfaces;


public class testInterfaces {
    public static void main(String[] args) {
        //Se puede crear variables de tipo interface
        //Pero no se puede crear objetos de tipo interface
        IAccesoDatos datos = new ImplementacionConMySQL();
        datos.listar();
        imprimir(datos);
        
        System.out.println("\n");
        
        datos = new ImplementacionOracle();
        datos.listar();
        imprimir(datos);
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.actualizar();
    }
}
