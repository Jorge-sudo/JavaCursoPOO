package paquete1Modificador_de_acceso;

//PRIVATE NO ESTA A NIVEL DE CLASE PERO SI DE ATRIBUTO

//Dejamos esta clase como default o package
class Private {
    //El atributo privado no se puede modificar ni con una clase hija o por mas que este en el mismmo paquete 
    private String atributoPrivado = "Valor atributo Privado";
    
    //El constructor privado no permite que podamos crear objetos desde otra clase 
    //solo se podra utilizar desde esta clase
    private Private(){
        System.out.println("Constructor Private");
    }
    
    public Private(String arg){
        this();
        System.out.println("Constructor publico");
    }
    //El metodo privado 
    private void metodoPrivate(){
        System.out.println("Metodo Private");
    }

    
    //Como son privados y no se pueden modificar ni mostrar los atributos utilizamos set y get.
    public String getAtributoPrivado() {
        return this.atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    
}
