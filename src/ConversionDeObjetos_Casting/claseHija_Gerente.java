package ConversionDeObjetos_Casting;

public class claseHija_Gerente extends Empleado { 
    private String departamento;
    
    public claseHija_Gerente (String nombre, double sueldo, String departamento){
        super(nombre, sueldo);//Con el super llamamos el constructor con argumentos de la clase padre 
        this.departamento=departamento;
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", departamento = "+this.departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento=departamento;
    }
    public String getDepartamento(){
        return this.departamento;
    }
}
