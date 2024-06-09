package PruebasUnitarias;

import Sistema.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsuarioTest {
    @Test
    public void testGetNombre() {
        Usuario usuario = new Usuario("Juan", "password123");
        assertEquals("Juan", usuario.getNombre());
    }

    @Test
    public void testGetContraseña() {
        Usuario usuario = new Usuario("Juan", "password123");
        assertEquals("password123", usuario.getContraseña());
    }

    @Test
    public void testGetPerfil() {
        Usuario usuario = new Usuario("Juan", "password123");
        Perfil perfil = new Perfil(usuario);
        assertEquals(perfil.toString(), usuario.getPerfil().toString());
    }


    @Test
    public void testAgregarPublicacion() {
        Usuario usuario = new Usuario("Juan", "password123");
        Perfil perfil = new Perfil(usuario);
        Publicacion publicacion = new Publicacion(usuario, "rutaFoto.jpg", "Descripción");
        perfil.agregarPublicacion(publicacion);
        assertTrue(perfil.getPublicaciones().contains(publicacion));
    }


}
