/**
 * La clase Publicacion representa una publicación en la red social Instagram.
 * Cada publicación tiene un autor, una ruta de foto y una descripción.
 */
class Publicacion {
    private Usuario autor;
    private String Rutafoto;
    private String descripcion;

    /**
     * Crea una nueva instancia de la clase Publicacion.
     * 
     * @param autor el autor de la publicación
     * @param fotos la ruta de la foto de la publicación
     * @param descripcion la descripción de la publicación
     */
    public Publicacion(Usuario autor, String fotos, String descripcion) {
        this.autor = autor;
        this.Rutafoto = fotos;
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el autor de la publicación.
     * 
     * @return el autor de la publicación
     */
    public Usuario getAutor() {
        return autor;
    }

    /**
     * Obtiene la ruta de la foto de la publicación.
     * 
     * @return la ruta de la foto de la publicación
     */
    public String getRutaFoto() {
        return Rutafoto;
    }

    /**
     * Obtiene la descripción de la publicación.
     * 
     * @return la descripción de la publicación
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Devuelve una representación en cadena de la publicación.
     * 
     * @return una representación en cadena de la publicación
     */
    @Override
    public String toString() {
        return "Publicación de " + autor.getNombre() +
                "\nFoto: " + Rutafoto +
                "\nDescripción: " + descripcion;
    }
}