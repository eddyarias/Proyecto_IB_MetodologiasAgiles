public class Test {

    @Test
    public void testGetPerfil() {
        Usuario usuario = new Usuario("Juan", "password123");
        Perfil perfil = new Perfil(usuario);
        usuario.setPerfil(perfil);
        assertEquals(perfil, usuario.getPerfil());
    }

    @Test
    public void testGetPublicaciones() {
        Usuario usuario = new Usuario("Juan", "password123");
        Perfil perfil = new Perfil(usuario);
        Publicacion publicacion = new Publicacion(usuario, "rutaFoto.jpg", "Descripción");
        perfil.agregarPublicacion(publicacion);
        assertTrue(perfil.getPublicaciones().contains(publicacion));
    }

    @Test
    public void testGetAutor() {
        Usuario usuario = new Usuario("Juan", "password123");
        Publicacion publicacion = new Publicacion(usuario, "rutaFoto.jpg", "Descripción");
        assertEquals(usuario, publicacion.getAutor());
        assertEquals("rutaFoto.jpg", publicacion.getRutaFoto());
        assertEquals("Descripción", publicacion.getDescripcion());
    }

}