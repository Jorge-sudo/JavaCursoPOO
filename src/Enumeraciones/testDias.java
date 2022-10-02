package Enumeraciones;

public class testDias {
    public static void main(String[] args) {
        
        //DE LA CLASE DIAS
        System.out.println(" Dia 1 = "+Dias.MARTES);
        indicarDiaSemana(Dias.LUNES);//No podemos poner un tipo String por que es un tipo "Dias"
        
        System.out.println("");
        
        //DE LA CLASE CONTINENTE
        System.out.println("Continente Nro. 4 = "+ Continentes.AMERICA);
        System.out.println("Nro. de paises en el 4to continente = "+ Continentes.AMERICA.getPaises());
        System.out.println("Continente Nro. 1 = "+ Continentes.AFRICA);
        System.out.println("Nro. de paises en el 4to continente = "+ Continentes.AFRICA.getPaises());
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
        } 
    }
}
