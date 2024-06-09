import Sistema.*;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * La clase principal de la aplicación Instagram.
 * Esta clase contiene el método principal y sirve como punto de entrada para la aplicación.
 * Proporciona funcionalidad para crear y gestionar usuarios, y realizar diversas acciones relacionadas con los perfiles de usuario.
 */
public class Main {
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String RESET = "\u001B[0m";
    private static List<Usuario> listaUsuarios = new ArrayList<>();
    private static Usuario usuarioActual;

    public static void main(String[] args) throws IOException {
        // Crear usuarios
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println(RED + "######  ##    ##  ###### ########     ##       ###########  ##########        ##       ####    ####" + RESET);
        System.out.println(PURPLE + "  ##    ###   ##  ##        ##       ####      ##           ##      ##       ####      ####    ####  " + RESET);
        System.out.println(YELLOW + "  ##    ## #  ##  ##        ##      ##  ##     ##           ##      ##      ##  ##     ## ##  ## ##   " + RESET);
        System.out.println(WHITE + "  ##    ##  # ##  ######    ##     ##    ##    ##    ####   ##   #####     ##    ##    ##   ##   ##   " + RESET);
        System.out.println(PURPLE + "  ##    ##   ###      ##    ##    ##########   ##      ##   ##    ##      ##########   ##        ##   " + RESET);
        System.out.println(RED + "  ##    ##    ##      ##    ##   ##        ##  ##      ##   ##     ##    ##        ##  ##        ##   " + RESET);
        System.out.println(YELLOW + "######  ##    ##  ######    ##  ##          ## ##########   ##       ## ##          ## ##        ##   " + RESET);
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println(PURPLE + "----- MENÚ PRINCIPAL -----" + RESET);
            System.out.println(RED + "1. Agregar nuevo usuario" + RESET);
            System.out.println(YELLOW + "2. Elegir usuario" + RESET);
            System.out.println(WHITE + "3. Salir" + RESET);
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el búfer
            switch (opcion) {
                case 1:
                    crearUsuario(scanner);
                    break;
                case 2:
                    cambiarUsuario(scanner);
                    if (usuarioActual != null) {
                        menuSecundario(scanner);
                    }
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println(RED + "Opción inválida. Intente nuevamente." + RESET);
                    break;
            }
        }
        System.out.println("¡Hasta luego!");
    }

    public static void crearUsuario(Scanner scanner) {
        System.out.println("----- CREAR USUARIO -----");
        System.out.print("Ingrese el nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Ingrese la contraseña: ");
        String contrasena = scanner.nextLine();
        Usuario usuario = new Usuario(nombreUsuario, contrasena);
        listaUsuarios.add(usuario);
        System.out.println("Sistema.Usuario creado exitosamente.");
    }

    public static void cambiarUsuario(Scanner scanner) {
        System.out.println("----- CAMBIAR DE USUARIO -----");
        if (listaUsuarios.isEmpty()) {
            System.out.println("No hay usuarios disponibles.");
            return;
        }
        System.out.println("Usuarios disponibles:");
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario usuario = listaUsuarios.get(i);
            System.out.println((i + 1) + ". " + usuario.getNombre());
        }
        System.out.print("Ingrese el número de usuario al que desea cambiar: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer
        if (opcion < 1 || opcion > listaUsuarios.size()) {
            System.out.println("Opción inválida. No se realizó el cambio de usuario.");
            usuarioActual = null;
        } else {
            usuarioActual = listaUsuarios.get(opcion - 1);
            System.out.println("¡Bienvenido, " + usuarioActual.getNombre() + "!");
        }
    }

    public static void menuSecundario(Scanner scanner) throws IOException {
        boolean salir = false;
        while (!salir) {
            System.out.println(PURPLE + "----- MENÚ SECUNDARIO -----" + RESET);
            System.out.println(RED + "1. Agregar publicación" + RESET);
            System.out.println(YELLOW + "2. Ver perfil" + RESET);
            System.out.println(WHITE + "3. Ver seguidores" + RESET);
            System.out.println(PURPLE + "4. Seguir Usuarios" + RESET);
            System.out.println(RED + "5. Salir" + RESET); 
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el búfer
            switch (opcion) {
                case 1:
                    usuarioActual.agregarPublicacion();
                    break;
                case 2:
                    usuarioActual.verPerfil();
                    break;
                case 3:
                    usuarioActual.verSeguidores();
                    break;
                case 4:
                    usuarioActual.seguirUsuario();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println(RED + "Opción inválida. Intente nuevamente." + RESET);
                    break;
            }
        }
    }
}