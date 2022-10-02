package ClaseAbstractas;

public class testClasesAbstractas {
    public static void main(String[] args) {
        //Como se puede ver no se puede crear un objeto de una clase abstracta solo podemos trabajar con clases hijas
        //FiguraGeometrica obj=new FiguraGeometrica();
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        //El metodo dibujar vendra de la clase hija
        //ya que el metodo dibujar de la clase padre es abstracta y no se puede axceder
        figura.dibujar();
    }
}
