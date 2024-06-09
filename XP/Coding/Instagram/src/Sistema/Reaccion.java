package Sistema;

public class Reaccion {
    private Tipo tipo;
    private Usuario autor;

    public Reaccion(Usuario autor, Publicacion publicacion) {
        this.autor = autor;
        tipo = Tipo.LIKE;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Usuario getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Reacción: " +
                "\nTipo: " + tipo +
                "\nAutor: " + autor.getNombre();
    }
}