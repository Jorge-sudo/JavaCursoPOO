package SobreEscritura;

//Si al momento de extender nos sale error es por que la clase padre no tiene un constructor vacio
public class claseHija_Gerente extends Empleado { 
    //Le ponemos private por que no tendra mas clases hijas y no es necesario poner protected
    private String departamento;
    
    public claseHija_Gerente (String nombre, double sueldo, String departamento){
        super(nombre, sueldo);//Con el super llamamos el constructor con argumentos de la clase padre 
        this.departamento=departamento;
    }
    
    
            //AQUI SE APLICA LA SOBRE ESCRITURA, POR QUE SOBRE ESCRIBIMOS EL METODO OBTENER DETALLES 
    //CON "@OVERRIDE" QUE PERTENECE A LA CLASE PADRE EMPLEADO
    
    //Recordar qu la clase hija tambien hereda los metodos
    
    //Ahora sobre Escribiremos el metodo obtener detalles
    
    //Este "@Override" nos quiere decir que es un mensaje 
    //para decir al compilador que este metodo esta siendo sobre escrito
    @Override
    public String obtenerDetalles(){
        //De esta forma no nos permite modificarlo asi que necesitamos la palabra super
//        return "nombre = "+this.nombre+", sueldo = "+ this.sueldo+", departamento = "+ this.departamento;

        //Veremos que con super no nos saldra error
        return super.obtenerDetalles()+", departamento = "+this.departamento;
    }
}
