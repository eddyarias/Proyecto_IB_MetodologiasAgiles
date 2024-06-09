package Sistema;

import java.util.ArrayList;

/**
 * La clase Publicacion representa una publicación en la red social Instagram.
 * Cada publicación tiene un autor, una ruta de foto y una descripción.
 */
public class Publicacion {
    private Usuario autor;
    private String Rutafoto;
    private String descripcion;
    private ArrayList<Comentario> comentarios;
    private ArrayList<Reaccion> reacciones;
    private ArrayList<Comparticion> comparticiones;

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
        this.comentarios = new ArrayList<>();
        this.reacciones = new ArrayList<>();
        this.comparticiones = new ArrayList<>();
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
     * Agrega un comentario a la publicación.
     * 
     * @param comentario el comentario a agregar
     */
    public void agregarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    /**
     * Muestra los comentarios de la publicación.
     */
    public void mostrarComentarios() {
        System.out.println("Comentarios de la publicación:");

        for (Comentario comentario : comentarios) {
            System.out.println(comentario.toString());
        }
    }

    /**
     * Agrega una reacción a la publicación.
     * 
     * @param reaccion la reacción a agregar
     */
    public void agregarReaccion(Reaccion reaccion) {
        reacciones.add(reaccion);
    }

    /**
     * Agrega una compartición a la publicación.
     * 
     * @param comparticion la compartición a agregar
     */
    public void agregarComparticion(Comparticion comparticion) {
        comparticiones.add(comparticion);
    }

    /**
     * Muestra los reaccionadores de la publicación.
     */
    public void mostrarReaccionadores() {
        for (Reaccion reaccion : reacciones) {
            System.out.println(reaccion.toString());
        }
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