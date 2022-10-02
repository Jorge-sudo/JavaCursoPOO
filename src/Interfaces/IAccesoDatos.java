package Interfaces;


public interface IAccesoDatos {
                
                            //INTERFACES
    //Las Interfaces trabajan naturalmente con base de datos como mySWL y ORACLE
    //Pero en este caso solo estamos dando ejemplos de como funciona "interface"
    
    
    //Este es una constante la cual es "public static final" y debe ser definido con un valor si o si 
    int MAX_REGISTROS = 10;
    
    //Aclarar tambien que cualquier metodo que agregemos sera "publico" y "Abstracto" automaticamente
    void insertar();//Vemos que este metodo es "Abstracto por lo tanto no tiene cuerpo termina con un punto y coma
    
    void listar();
    
    void actualizar();
    
    void eliminar();

            //SIMULAREMOS UNA IMPLEMENTACION CON COMPORTAMIENTO CON SQL
    
}
