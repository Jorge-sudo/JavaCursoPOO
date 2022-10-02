package JavaBeans;

import java.io.Serializable;

//Aclarar que, para que tecnologias como Frameworks como Spring y otrs lo reconozcan como una clase.
//Debe tener ciertas reglas, como que debe ser una clase beans como esta 

              //Es necesario implementar la interfaz "Serializable" e importarlo. si o si 
public class Persona implements Serializable {
   
        //Para que se concidere un java bean deben ser  si o si atributos privados
    private String nombre;
    private String apellido;
    
        //Para que las tecnologias reconozcan esta clase se debe tener si o si un constructor vacio
    public Persona(){
        
    }
    
    //Este paso no es necesario, pero lo ponemos para inicializar los atributos 
    public Persona(String nombre,String apellido){
        this.nombre=nombre;
        this.apellido=apellido;
    }
        
        //Este paso tambien es requerido agregar metodos set y get
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    //Lo demas metodos no es necesario implementar pero implementaremos el metodo toString
    @Override
    public String toString(){
        return "Persona : {"+"nombre="+this.nombre+", apellido="+this.apellido+'}';
    }
    
}
