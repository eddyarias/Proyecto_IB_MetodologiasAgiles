package PruebasUnitarias;

import Sistema.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReaccionTest {

    private Usuario autor;
    private Reaccion reaccion;

    @BeforeEach
    public void setUp() {
        autor = new Usuario("usuarioTest", "password123");
        Publicacion publicacion = new Publicacion(autor, "rutaFoto", "Descripción de prueba");
        reaccion = new Reaccion(autor, publicacion);
    }

    @Test
    public void testGetTipo() {
        assertEquals(Tipo.LIKE, reaccion.getTipo());
    }

    @Test
    public void testGetAutor() {
        assertEquals(autor, reaccion.getAutor());
    }

    @Test
    public void testToString() {
        String expected = "Reacción: " +
                "\nTipo: LIKE" +
                "\nAutor: usuarioTest";
        assertEquals(expected, reaccion.toString());
    }
}
