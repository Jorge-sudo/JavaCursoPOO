
package TipoGenerico;

//CON LA LETRA T INDICAMOS QUE ES UN TIPO GENERICO
public class ClaseGenerica <T>{
    
    //Ya que es un tipo generico no sabemos de que tipo es
    T objeto;
    
    //Agregamos un constructor para esta clase 
    public ClaseGenerica(T objeto){
        this.objeto=objeto;
    }
     public void obtenerTipo(){
         //No podemos llamar solo el "objeto" por que no esta definido aun de que tipo es
         //Pero con los metodos "getClass" utilizados se podra imprimir el tipo que finalmente se utilizo
         //para crear una instancia de esta clase
         System.out.println(" Objeto T es = " +  objeto.getClass().getSimpleName());
     }

}
