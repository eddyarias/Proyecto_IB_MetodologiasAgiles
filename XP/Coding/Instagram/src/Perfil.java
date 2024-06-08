import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase Perfil representa el perfil de un usuario en la aplicación Instagram.
 * Contiene información sobre el usuario, sus publicaciones, seguidores y otras funcionalidades relacionadas.
 */
class Perfil {
    private Usuario usuario;
    private ArrayList<Publicacion> publicaciones;
    private int numSeguidores;
    private ArrayList<Usuario> seguidores;

    /**
     * Crea un nuevo objeto Perfil con el usuario especificado.
     * @param usuario El usuario asociado al perfil.
     */
    public Perfil(Usuario usuario) {
        this.usuario = usuario;
        this.publicaciones = new ArrayList<>();
        this.seguidores = new ArrayList<>();
        this.numSeguidores = 0;
    }

    /**
     * Agrega una nueva publicación al perfil.
     * @param publicacion La publicación a agregar.
     */
    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    /**
     * Muestra el contenido de todas las publicaciones del perfil.
     * @throws IOException Si ocurre un error al abrir la foto de una publicación.
     */
    public void mostrarContenidoPublicaciones() throws IOException {
        int i = 1;
        for (Publicacion publicacion : publicaciones) {
            System.out.println("--------Publicación--------" + i);
            // Reemplaza con la ruta de la foto que se muestra en la consola
            String rutaFoto = publicacion.getRutaFoto();
            File foto = new File(rutaFoto);
            System.out.println(publicacion.toString());
            Desktop.getDesktop().open(foto);
            i++;
        }
    }

    /**
     * Incrementa el número de seguidores del perfil en uno.
     */
    public void incrementarSeguidores() {
        numSeguidores++;
    }

    /**
     * Obtiene la lista de seguidores del perfil.
     * @return La lista de seguidores.
     */
    public ArrayList<Usuario> getSeguidores() {
        return seguidores;
    }

    /**
     * Obtiene la cantidad de publicaciones del perfil.
     * @return La cantidad de publicaciones.
     */
    public int getCantidadPublicaciones() {
        return publicaciones.size();
    }

    /**
     * Obtiene la lista de publicaciones del perfil.
     * @return La lista de publicaciones.
     */
    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    /**
     * Agrega un nuevo seguidor al perfil.
     * @param seguidor El usuario que desea seguir al perfil.
     */
    public void agregarSeguidor(Usuario seguidor) {
        for (Usuario seguidores : seguidores) {
            if (seguidores.equals(seguidor)) {
                System.out.println("Ya sigues a " + seguidor.getNombre());
                return;
            }
        }
        seguidores.add(seguidor);
        incrementarSeguidores();
        System.out.println("Has comenzado a seguir a " + seguidor.getNombre());
    }

    /**
     * Muestra la lista de seguidores del perfil.
     * @param seguidores La lista de seguidores a mostrar.
     */
    public void mostrarSeguidores(List<Usuario> seguidores) {
        System.out.println("-----SEGUIDORES-----");
        for (int i = 0; i < seguidores.size(); i++) {
            Usuario seguidor = seguidores.get(i);
            System.out.println("Seguidor " + (i + 1) + ": " + seguidor.getNombre());
        }
    }

    /**
     * Devuelve una representación en cadena del perfil.
     * @return La representación en cadena del perfil.
     */
    public String toString() {
        return "Perfil de " + usuario.getNombre() +
                "\nSeguidores: " + numSeguidores +
                "\nCantidad de publicaciones: " + publicaciones.size();
    }
}