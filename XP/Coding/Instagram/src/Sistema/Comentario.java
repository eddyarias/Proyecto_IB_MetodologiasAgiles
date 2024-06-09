package Sistema;

public class Comentario {
    private String contenido;
    private Usuario autor;

    public Comentario(Usuario autor, String contenido) {
        this.autor = autor;
        this.contenido = contenido;
    }
    /**
     * Establece el contenido del comentario.
     * 
     * @param contenido el contenido del comentario
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Establece el autor del comentario.
     * 
     * @param autor el autor del comentario
     */
    public void setAutor(Usuario autor) {
        this.autor = autor;
    }
    public String getContenido() {
        return contenido;
    }

    public Usuario getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "\nContenido del comentario : " + contenido +
                "\nAutor del comentario : " + autor.getNombre();
    }
}