package Sistema;

import java.util.Random;
/**
 * La clase Comparticion representa una compartición de contenido en la aplicación Instagram.
 * Cada compartición tiene un enlace único y un autor asociado.
 */
public class Comparticion {
    private String link;
    private Usuario autor;

    /**
     * Crea una nueva instancia de Comparticion con el autor especificado.
     * El enlace de la compartición se genera automáticamente.
     *
     * @param autor el autor de la compartición
     */
    public Comparticion(Usuario autor) {
        this.autor = autor;
        this.link = RandomLink();
    }

    /**
     * Obtiene el enlace de la compartición.
     *
     * @return el enlace de la compartición
     */
    public String getLink() {
        return link;
    }

    /**
     * Genera un enlace aleatorio para la compartición.
     *
     * @return el enlace aleatorio generado
     */
    public static String RandomLink() {
        String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int LINK_LENGTH = 10;
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < LINK_LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();
    }
}