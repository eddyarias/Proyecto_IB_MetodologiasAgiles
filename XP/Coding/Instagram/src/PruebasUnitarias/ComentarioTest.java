package PruebasUnitarias;

import Sistema.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComentarioTest {

    private Usuario autor;
    private Comentario comentario;

    @BeforeEach
    public void setUp() {
        autor = new Usuario("usuarioTest", "password123");
        comentario = new Comentario(autor, "Este es un comentario de prueba");
    }

    @Test
    public void testGetContenido() {
        assertEquals("Este es un comentario de prueba", comentario.getContenido());
    }

    @Test
    public void testGetAutor() {
        assertEquals(autor, comentario.getAutor());
    }

    @Test
    public void testToString() {
        String expected = "\nContenido del comentario : Este es un comentario de prueba" +
                "\nAutor del comentario : usuarioTest";
        assertEquals(expected, comentario.toString());
    }
}

