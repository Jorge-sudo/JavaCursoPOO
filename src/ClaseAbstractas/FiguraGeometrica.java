package ClaseAbstractas;

//Si un metodo de la clase es "Abstarc" por obligacion la clase tambien debe ser "Abstrac"
public abstract class FiguraGeometrica {
  //La clase padre o metodo no definira un comportamiento por que es "abtrac" por lo cual la clase hija 
  //Que no es "abstrac" debe definir el comportamiento
    protected String tipoFigura;
    
    protected FiguraGeometrica(String figura){
        this.tipoFigura=figura;
    }
    
    //El metodo abstracto solo se definir haci y se debe terminar con un punto y coma
    public abstract void dibujar();//Ya que este metodo es abstracto la clase obligadamente debe ser igual abstracto
    //Tambien podemos ver que este metodo no tiene cuerpo solo de define en una sola linea
    
    public void setTipoFigura(String figura){
        this.tipoFigura=figura;
    }
    
    public String getTipoFigura(){
        return this.tipoFigura;
    }
    
    @Override
    public String toString(){
        return "FiguraGeometrica {"+ "tipoFigura = "+ this.tipoFigura+'}';
    }
}
