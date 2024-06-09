package PruebasUnitarias;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Sistema.Perfil;
import Sistema.Publicacion;
import Sistema.Usuario;

public class PerfilTest {
    @Test
    public void testAgregarPublicacion() {
        Usuario usuario = new Usuario("Juan", "password123");
        Perfil perfil = new Perfil(usuario);
        Publicacion publicacion = new Publicacion(usuario, "rutaFoto.jpg", "Descripción");
        perfil.agregarPublicacion(publicacion);
        assertTrue(perfil.getPublicaciones().contains(publicacion));
    }

    @Test
    public void testGetPublicaciones() {
        Usuario usuario = new Usuario("Juan", "password123");
        Perfil perfil = new Perfil(usuario);
        Publicacion publicacion = new Publicacion(usuario, "rutaFoto.jpg", "Descripción");
        perfil.agregarPublicacion(publicacion);
        assertTrue(perfil.getPublicaciones().contains(publicacion));
    }

}
