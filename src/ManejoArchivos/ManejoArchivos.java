package ManejoArchivos;

import java.io.*;

public class ManejoArchivos {
    
            //CON ESTE METODO CREAMOS EL ARCHIVO
    
    public static void crearArchivo(String nombreArchivo){
        //Aqui solo emos creado un objeto de tipo file 
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();//Una vez que cerramos el flujo ya se crea el archivo
            System.out.println("Se creo el archivo");
            
            //"FileNotFoundException" ese es la posible exception que nos arroje 
        } catch (FileNotFoundException ex) {
            //en este caso solo reportamos la exception
            ex.printStackTrace(System.out);
        }
        
    }
    
                //CON ESTE METODO ESCRIBIMOS ALGO AL ARCHIVO AL ARCHIVO
    
    public static void escribirArchivo(String nombreArchivo,String contenido){
        //Aqui solo emos creado un objeto de tipo file 
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            //Con este print podemos agregar todo tipo de parametros String int boolean y ect.
            salida.println(contenido);
            
            salida.close();//Una vez que cerramos el flujo ya se crea el archivo
            System.out.println("Se a escrito al archivo");
            
            //"FileNotFoundException" ese es la posible exception que nos arroje 
        } catch (FileNotFoundException ex) {
            //en este caso solo reportamos la exception
            ex.printStackTrace(System.out);
        }
    }
    
                //CON ESTE METODO AGREGAMOS INFORMACION AL ARCHIVO SIN QUE SE BORRE EL ANTERIOR DATO
    
    public static void agregarInformacion(String nombreArchivo, String contenido){
        //Aqui solo emos creado un objeto de tipo file 
        File archivo = new File(nombreArchivo);
        try {
            
            //Para que la informacion se guarde creamos un nuevo objeto de tipo "FileWriter (nombreDeArchivo, true-si)"
            //El true es para confirmar que se agregara informacion o no en este caso es necesario y por eso es true
            //Pero recordar que esto nos manda otra exception que es la "IOException" y es necesario poner un catch
            PrintWriter salida = new PrintWriter( new FileWriter (archivo, true));
            
            
            //Con este print podemos agregar todo tipo de parametros String int boolean y ect.
            salida.println(contenido);
            salida.close();//Una vez que cerramos el flujo ya se crea el archivo
            System.out.println("Se a Anexado informacion al archivo al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            //hacemos lo mismo que en "FileNotFoundException"
            ex.printStackTrace(System.out);
        }
    }
    
                    //CON ESTE METODO SE PODRA LEER INFORMACION DEL ARCHIVO
    
    public static void leerArchivo (String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            //Con esta clase "BufferedReader " lo que hacemos es leer el archivo
            //Tambien creamos un objeto "FileReader" ya que no lee lineas completas pero el "BufferedReader"
                                    //"FileReader" nos arooga una exception la cual es obligatorio poner un try y catch
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            
                //"readLine" tambien nos arroja una exception y es necesario un catch "IOException"
            String lectura = entrada.readLine();//Con esto solo nos leera una linea
            
                //Ahora si queremos que lea todas las lineas haremos un ciclo "while"
            while(lectura != null){
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
