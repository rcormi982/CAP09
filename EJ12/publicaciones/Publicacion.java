package EJ12.publicaciones;

public class Publicacion {
    protected String ISBN;
    protected String titulo;
    protected int anio;
    //Constructor
    public Publicacion(String ISBN, String titulo, int anio){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.anio = anio;
    }
    public String getISBN() {
        return ISBN;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getAnio() {
        return anio;
    }
    @Override
    public String toString() {
        return String.format("ISBN: %s, título: %s," + " año de publicación: %d", this.ISBN, this.titulo, 
        this.anio);
    }
}

