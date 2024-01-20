/*Se quiere informatizar una biblioteca. Crea las clases Publicacion, Libro y
Revista. Las clases deben estar implementadas con la jerarquía correcta. Las
características comunes de las revistas y de los libros son el código ISBN, el
título, y el año de publicación. Los libros tienen además un atributo prestado.
Cuando se crean los libros, no están prestados. Las revistas tienen un número.
La clase Libro debe implementar la interfaz Prestable que tiene los métodos
presta, devuelve y estaPrestado. */
package EJ12;

import EJ12.publicaciones.AlreadyLentException;
import EJ12.publicaciones.Libro;
import EJ12.publicaciones.Revista;

public class Ejercicio12 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("123456", "La Ruta Prohibida", 2007);
        Libro libro2 = new Libro("112233", "Los Otros", 2016);
        Libro libro3 = new Libro("456789", "La rosa del mundo", 1995);
        Revista revista1 = new Revista("444555", "Año Cero", 2019, 344);
        Revista revista2 = new Revista("002244", "National Geographic", 2003, 255);
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(revista1);
        System.out.println(revista2);
        try {
            libro2.presta();
        } catch (AlreadyLentException e) {
            System.out.println("Lo siento, ese libro ya está prestado.");
        }
        if (libro2.estaPrestado()) {
        System.out.println("El libro está prestado");
        }
        try {
            libro2.presta();
        } catch (AlreadyLentException e) {
            System.out.println("Lo siento, ese libro ya está prestado.");
        }
        libro2.devuelve();
        if (libro2.estaPrestado()) {
        System.out.println("El libro está prestado");
        }
        try {
            libro3.presta();
        } catch (AlreadyLentException e) {
            System.out.println("Lo siento, ese libro ya está prestado.");
        }
        System.out.println(libro2);
        System.out.println(libro3);
    }
}
