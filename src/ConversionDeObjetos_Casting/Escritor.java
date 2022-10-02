package ConversionDeObjetos_Casting;

public class Escritor extends Empleado{
    
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura=tipoEscritura;
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", Tipo Escritura = "+this.tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + '}' + super.toString();
    }
    
    //Este metodo solo existe en la clase "Escritor" por lo tanto no podremos axceder desde un objeto Empleado(padre)
    //Solo se puede axceder a ello un metodo en comun desde las 2 clases con el mismo nombre con SobreEscritura
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
    
}
