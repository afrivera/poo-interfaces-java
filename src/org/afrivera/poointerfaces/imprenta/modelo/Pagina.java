package org.afrivera.poointerfaces.imprenta.modelo;

public class Pagina extends Hoja implements Imprimible{


    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return this.contenido;
    }

//    @Override
//    public String imprimirInterface() {
//        return null;
//    }
}
