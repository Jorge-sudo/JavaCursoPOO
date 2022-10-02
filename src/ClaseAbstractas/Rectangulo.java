package ClaseAbstractas;

public class Rectangulo extends FiguraGeometrica {
    
    public Rectangulo(String figura){
        super(figura);
    }
    
    //Impleamentando un metodo de la clase padre por primera vez 
    @Override
    public void dibujar(){//implementamos el metodo abstracto
                                        //Con esto 
        System.out.println("Se imprime un : "+ this.tipoFigura );//this.getClass().getSimpleName()
    }
}
