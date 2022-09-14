package org.afrivera.poointerfaces.imprenta.modelo;

public interface Imprimible {

    String imprimir();

    // a partir de java 8

    String TEXTO = "TEXTO X";
    // para no estar obligado a implementar un metodo se pone el default
    default String noObligado(){
        return "imprime valor por defecto";
    };

    // es posible un metodo estatico
    static void impresion(Imprimible imprimible){
        System.out.println("cualquier tontera");
    }
}
