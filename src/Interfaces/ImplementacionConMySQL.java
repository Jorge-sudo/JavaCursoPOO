package Interfaces;

//Con "implements" implementamos la interfaces
public class ImplementacionConMySQL implements IAccesoDatos {

    //Aqui aclarar que no estamos sobre Escribiendo sinos estamos implementando por primera vez los metodos
    @Override
    public void insertar() {
        System.out.println("Insertar desde MySQL");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySQL");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde MySQL");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde MySQL");
    }
    
    //AHORA SI QUEREMOS IMPLEMENTAR CON OTRA BASE DE DATOS CREAMOS OTRA CLASE

}
