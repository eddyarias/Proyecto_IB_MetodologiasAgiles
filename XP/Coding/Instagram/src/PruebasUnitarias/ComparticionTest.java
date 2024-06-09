package PruebasUnitarias;

import Sistema.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComparticionTest {

    private Usuario autor;
    private Comparticion comparticion;

    @BeforeEach
    public void setUp() {
        autor = new Usuario("usuarioTest", "password123");
        comparticion = new Comparticion(autor);
        comparticion.setLink("https://enlace.com/prueba");
    }

    @Test
    public void testGetLink() {

        assertEquals("https://enlace.com/prueba", comparticion.getLink());
    }

    @Test
    public void testGetAutor() {
        assertEquals(autor, comparticion.getAutor());
    }
}
