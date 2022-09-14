package org.afrivera.poointerfaces.imprenta;

import org.afrivera.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo("Resumen Laboral",
                new Persona("Andres", "Rivera"), "Programador Web" );

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de Diseño: Elem. Reusables POO",
                Genero.PROGRAMACION);

        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador FullStack")
                .addExperiencia("Angular");

        Informe informe = new Informe("Estudio de MicroServicios",
                new Persona("Martin", "Fowler"), new Persona("James", "Bond"));

        imprimir(cv);
        imprimir(informe);
        // imprimir(libro); // no se puede ya que no extiende de hoja
        imprimir(libro); // no se puede ya que no extiende de hoja
        imprimirInterface(cv);
        imprimirInterface(informe);
        imprimirInterface(libro);
    }
    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }

    public static void imprimirInterface(Imprimible imprimible){
        System.out.println(imprimible.imprimir() + "\n");
    }
}
