package PruebasUnitarias;

import Sistema.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PublicacionTest {
    @Test
    public void testGetAutor() {
        Usuario usuario = new Usuario("Juan", "password123");
        Publicacion publicacion = new Publicacion(usuario, "rutaFoto.jpg", "Descripción");
        assertEquals(usuario, publicacion.getAutor());
    }

    @Test
    public void testGetRutaFoto() {
        Usuario usuario = new Usuario("Juan", "password123");
        Publicacion publicacion = new Publicacion(usuario, "rutaFoto.jpg", "Descripción");
        assertEquals("rutaFoto.jpg", publicacion.getRutaFoto());
    }

}
