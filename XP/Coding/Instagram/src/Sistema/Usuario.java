package Sistema;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * La clase Usuario representa a un usuario en el sistema de Instagram.
 * Cada usuario tiene un nombre, una contraseña y un perfil asociado.
 * Los usuarios pueden realizar diversas acciones, como agregar publicaciones,
 * ver publicaciones, seguir a otros usuarios, ver su propio perfil y ver
 * los seguidores que tienen.
 */
public class Usuario {
    private String nombre;
    private String contraseña;
    private Perfil perfil;
    private static List<Usuario> listaUsuarios = new ArrayList<>();

    /**
     * Crea un nuevo objeto Usuario con el nombre y contraseña especificados.
     * También crea un perfil asociado al usuario y lo agrega a la lista de usuarios.
     *
     * @param nombre     el nombre del usuario
     * @param contraseña la contraseña del usuario
     */
    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.perfil = new Perfil(this);
        listaUsuarios.add(this);
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return el nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return la contraseña del usuario
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Obtiene el perfil del usuario.
     *
     * @return el perfil del usuario
     */
    public Perfil getPerfil() {
        return perfil;
    }


    /**
     * Agrega una nueva publicación al perfil del usuario.
     * 
     * @throws IOException si ocurre un error de entrada/salida
     */
    public void agregarPublicacion() throws IOException {
        Scanner scanner = new Scanner(System.in);
        // Directorio de imágenes
        File[] archivos = obtenerArchivosDirectorio("Images");
        if (archivos.length == 0) {
            System.out.println("No se encontraron imágenes en el directorio especificado.");
            return;
        }
        System.out.println("Rutas de imágenes disponibles:");
        for (int i = 0; i < archivos.length; i++) {
            System.out.println((i + 1) + ". " + archivos[i].getPath());
        }
        System.out.print("Seleccione el número de la imagen que desea publicar: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer
        if (opcion < 1 || opcion > archivos.length) {
            System.out.println("Opción inválida. No se realizó la publicación.");
            return;
        }
        String rutaFoto = archivos[opcion - 1].getPath();
        System.out.print("Ingrese su descripción: ");
        String descripcion = scanner.nextLine();
        perfil.agregarPublicacion(new Publicacion(this, rutaFoto, descripcion));
        System.out.println("-------Publicación realizada con éxito----");
        this.verPublicaciones();
    }

    /**
     * Muestra las publicaciones del perfil del usuario.
     * 
     * @throws IOException si ocurre un error de entrada/salida
     */
    public void verPublicaciones() throws IOException {
        perfil.mostrarContenidoPublicaciones();
    }

    /**
     * Permite al usuario seguir a otro usuario.
     */
    public void seguirUsuario() {
        System.out.println("-----USUARIOS DISPONIBLES PARA SEGUIR-----");
        int indice = verPosibleUsuarios();
        Usuario usuarioSeleccionado = listaUsuarios.get(indice - 1);
        if (usuarioSeleccionado == this) {
            System.out.println("No puedes seguirte a ti mismo");
            return;
        }
        Perfil perfil = usuarioSeleccionado.getPerfil();
        perfil.agregarSeguidor(usuarioSeleccionado);
    }

    /**
     * Muestra el perfil del usuario seleccionado.
     * 
     * @return el usuario seleccionado
     * @throws IOException si ocurre un error de entrada/salida
     */
    public Usuario verPerfil() throws IOException {
        int eleccion = this.verPosibleUsuarios();
        Usuario usuarioSeleccionado = listaUsuarios.get(eleccion - 1);
        if (!(usuarioSeleccionado == this)) {
            System.out.println(usuarioSeleccionado.perfil.toString());
            usuarioSeleccionado.verPublicaciones();
            return usuarioSeleccionado;
        }
        System.out.println(this.perfil.toString());
        this.verPublicaciones();
        return this;
    }

    /**
     * Muestra los seguidores del usuario.
     */
    public void verSeguidores() {
        List<Usuario> seguidores = this.getPerfil().getSeguidores();
        perfil.mostrarSeguidores(seguidores);
    }

    /**
     * Muestra los usuarios disponibles y permite seleccionar uno.
     * 
     * @return la elección del usuario
     */
    public int verPosibleUsuarios() {
        Scanner scanner = new Scanner(System.in);
        int eleccion;
        System.out.println("Usuarios disponibles:");
        int contador = 1;
        for (Usuario usuario : listaUsuarios) {
            if (usuario == this) {
                System.out.println(contador + ". " + usuario.getNombre() + " (Mi usuario) ");
                contador++;
            } else {
                System.out.println(contador + ". " + usuario.getNombre());
                contador++;
            }
        }
        System.out.println("Seleccione uno:");
        int i = 0;
        eleccion = scanner.nextInt();
        do {
            if (!(eleccion >= 1 && eleccion <= listaUsuarios.size())) {
                System.out.println("Eleccion no valida, ingrese de nuevo");
            }
            scanner.nextLine();
            i++;
            return eleccion;
        } while (i != 1);
    }

    /**
     * Obtiene los archivos de imagen en un directorio.
     * 
     * @param directorio el directorio de imágenes
     * @return los archivos de imagen en el directorio
     */
    private File[] obtenerArchivosDirectorio(String directorio) {
        File folder = new File(directorio);
        return folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".jpeg")
                || name.toLowerCase().endsWith(".jpg") || name.toLowerCase().endsWith(".png"));
    }

    /**
     * Devuelve una representación en cadena del objeto Usuario.
     * 
     * @return una representación en cadena del objeto Usuario
     */
    @Override
    public String toString() {
        return "Sistema.Usuario{" +
                "nombre='" + nombre + '\'' +
                ", perfil=" + perfil +
                '}';
    }

    /**
     * Establece el perfil del usuario.
     *
     * @param perfil2 el perfil del usuario
     */
    public void setPerfil(Perfil perfil2) {
        throw new UnsupportedOperationException("Unimplemented method 'setPerfil'");
    }

    /**
     * Realiza un comentario en una publicación de otro usuario.
     *
     * @param usuario el usuario cuya publicación se va a comentar
     * @throws IOException si ocurre un error de entrada/salida
     */
    public void realizarComentario(Usuario usuario) throws IOException {
        Scanner indeee = new Scanner(System.in);
        usuario.getPerfil().mostrarContenidoPublicaciones();
        System.out.print("Seleccione la publicación:");
        int indicePublicacion = indeee.nextInt();
        // Verificar si el índice ingresado es válido
        ArrayList<Publicacion> publicaciones = usuario.getPerfil().getPublicaciones();
        if (verificarIndicePublicacion(indicePublicacion, publicaciones))
            return;
        Publicacion publicacion = publicaciones.get(indicePublicacion - 1);
        String textoComentario = redactarComentario();
        enviarComentario(textoComentario, publicacion);
    }


    /**
     * Permite al usuario redactar un comentario.
     * 
     * @return el texto del comentario ingresado por el usuario.
     */
    private String redactarComentario() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Ingrese su comentario: ");
        String textoComentario = scanner2.nextLine();
        return textoComentario;
    }


    /**
     * Verifica si el índice de la publicación es válido.
     * 
     * @param indicePublicacion el índice de la publicación a verificar
     * @param publicaciones la lista de publicaciones
     * @return true si el índice de la publicación no es válido, false de lo contrario
     */
    private boolean verificarIndicePublicacion(int indicePublicacion, ArrayList<Publicacion> publicaciones) {
        if (!(indicePublicacion >= 1 && indicePublicacion <= publicaciones.size())) {
            System.out.println("¡El número de la publicación ingresado no es válido!");
            return true;
        }
        return false;
    }

    /**
     * Realiza una reacción en una publicación de otro usuario.
     *
     * @param usuario el usuario cuya publicación se va a reaccionar
     * @throws IOException si ocurre un error de entrada/salida
     */
    public void realizarReaccion(Usuario usuario) throws IOException {
        Scanner scanner = new Scanner(System.in);
        usuario.getPerfil().mostrarContenidoPublicaciones();
        System.out.print("Seleccione la publicación");
        int indicePublicacion = scanner.nextInt();
        ArrayList<Publicacion> publicaciones = usuario.getPerfil().getPublicaciones();
        if (verificarIndicePublicacion(indicePublicacion, publicaciones))
            return;
        Publicacion publicacion = publicaciones.get(indicePublicacion - 1);
        enviarReaccion(this, publicacion);
    }

    /**
     * Envía una reacción a una publicación.
     *
     * @param autor      el usuario que realiza la reacción
     * @param publicacion la publicación a la que se realiza la reacción
     */
    private void enviarReaccion(Usuario autor, Publicacion publicacion) {
        Reaccion reaccion = new Reaccion(autor, publicacion);
        publicacion.agregarReaccion(reaccion);
    }

    /**
     * Envía un comentario a una publicación.
     *
     * @param texto      el texto del comentario
     * @param publicacion la publicación a la que se realiza el comentario
     */
    public void enviarComentario(String texto, Publicacion publicacion) {
        Comentario comentario = new Comentario(this, texto);
        publicacion.agregarComentario(comentario);
    }

    /**
     * Muestra los comentarios de una publicación.
     *
     * @throws IOException si ocurre un error de entrada/salida
     */
    public void verComentarios() throws IOException {
        Scanner scanner = new Scanner(System.in);
        this.getPerfil().mostrarContenidoPublicaciones();
        System.out.print("Seleccione la publicación");
        int indicePublicacion = scanner.nextInt();
        // Verificar si el índice ingresado es válido
        ArrayList<Publicacion> publicaciones = this.getPerfil().getPublicaciones();
        if (verificarIndicePublicacion(indicePublicacion, publicaciones))
            return;
        Publicacion publicacion = publicaciones.get(indicePublicacion - 1);
        publicacion.mostrarComentarios();
    }

    /**
     * Muestra los usuarios que han reaccionado a una publicación.eturn;
     *
     * @throws IOException si ocurre un error de entrada/salida
     */
    public void verReaccion() throws IOException {
        Scanner scanner = new Scanner(System.in);
        this.getPerfil().mostrarContenidoPublicaciones();
        System.out.print("Seleccione la publicación");
        int indicePublicacion = scanner.nextInt();
        // Verificar si el índice ingresado es válido
        ArrayList<Publicacion> publicaciones = this.getPerfil().getPublicaciones();
        if (verificarIndicePublicacion(indicePublicacion, publicaciones))
            return;
        Publicacion publicacion = publicaciones.get(indicePublicacion - 1);
        publicacion.mostrarReaccionadores();
    }

    /**
     * Realiza una compartición de una publicación de otro usuario.eturn;
     *
     * @param usuario1 el usuario cuya publicación se va a compartir
     * @throws IOException si ocurre un error de entrada/salida
     */
    public void realizarComparticion(Usuario usuario1) throws IOException {
        Scanner scanner = new Scanner(System.in);
        usuario1.getPerfil().mostrarContenidoPublicaciones();
        System.out.print("Seleccione la publicación");
        int indicePublicacion = scanner.nextInt();
        // Verificar si el índice ingresado es válido
        ArrayList<Publicacion> publicaciones = usuario1.getPerfil().getPublicaciones();
        if (verificarIndicePublicacion(indicePublicacion, publicaciones))
            return;
        Publicacion publicacion = publicaciones.get(indicePublicacion - 1);
        Comparticion comparticion = new Comparticion(this);
        perfil.agregarPublicacion(
                new Publicacion(publicacion.getAutor(), comparticion.getLink(), publicacion.getDescripcion()));
        publicacion.agregarComparticion(comparticion);
        System.out.println("FOTO COMPARTIDA EXITOSAMENTE");
        System.out.println("Link: " + comparticion.getLink());
    }
}