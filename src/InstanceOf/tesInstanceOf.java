package InstanceOf;


public class tesInstanceOf {
    public static void main(String[] args) {
        
        Empleado empleado=new Empleado("Juan", 5000);
        
        
        empleado=new claseHija_Gerente("Jose",1000,"Contabilidad");
        determinarTipo(empleado);

    }
    
    public static void determinarTipo(Empleado empleado){
        //Lo que hacemos aqui es preguntar si la variable empleado es de tipo gerente
        
        //Se pregunta si "empleado" se esta apuntando a tipo gerente
        if(empleado instanceof claseHija_Gerente){//CLASE HIJA
            System.out.println("Es de tipo Gerente");
    //Primero creamos una variable de tipo gerente despues le asignamos un valor luego
    //Aqui lo que hacemos es convertir la variable "empleado" a tipo "gerente" con "(claseHija_Gerente)empleado"
            claseHija_Gerente gerente=(claseHija_Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
              //Otra forma de convertir a tipo Gerente y mostrar el departamento en una sola linea
            System.out.println("gerente = " + ((claseHija_Gerente)empleado).getDepartamento());
            
            
        }else if(empleado instanceof Empleado){//CLASE PADRE
            System.out.println("Es de tipo empleado");
            
    //Nos marcara error, pero al momento de ejecutar lo hara por que no se puede por que el objeto es de tipo empleado      
          //No podemos convertir un dato de tipo empleado a tipo gerente
          //claseHija_Gerente gerente=(claseHija_Gerente)empleado;
          //System.out.println("gerente = " + gerente.getDepartamento());
          
          //PRO SI PODEMOS AXCEDER A LOS METODOS DE LA CLASE PADRE
            System.out.println("nombre = "+ empleado.getNombre());
            
        }else if(empleado instanceof Object){//CLASE ABUELO
            System.out.println("Es de tipo Object");
             //PRO SI PODEMOS AXCEDER A LOS METODOS DE LA CLASE PADRE
            System.out.println("toString = "+ empleado.toString());
            
            //Se debe preguntar de clase nieta a clase abuelo
        }//Si o si hay que poner else por que la clase hija esta ligada con el padre 
        //la cual instanceof nos dara verdadero por eso es necesario ponerle el else y de clase nieta a clase abuelo.
    }
}
