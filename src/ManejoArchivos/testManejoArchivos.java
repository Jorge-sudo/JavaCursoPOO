
package ManejoArchivos;

import static ManejoArchivos.ManejoArchivos.*;

public class testManejoArchivos {
    public static void main(String[] args) {
        //Para espesificar la ruta en windons es "c:\\Users\\JORGE\\Documents\\prueba.txt"
        //En mac o linux es "/carpeta/prueba.txt"
        String nombre = "prueba.txt";
//        crearArchivo(nombre);
        agregarInformacion(nombre,"hola mundo");
        agregarInformacion(nombre," Escrito desde java");

        leerArchivo(nombre);
    }
}
