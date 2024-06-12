# Metáfora del Sistema

**"Un álbum digital interactivo"**: Imagina el sistema como un estudio de arte digital donde cada usuario tiene su caballete (perfil) para pintar y exhibir sus obras (publicaciones). Los visitantes (otros usuarios) pueden admirar las obras, dejar comentarios como si firmaran un libro de visitas, poner un distintivo de 'me gusta' como un aplauso simbólico, o incluso llevar una copia de la obra a su espacio personal (compartición). Este estudio no solo es un lugar para exhibir, sino un espacio interactivo donde los artistas (usuarios) se conectan, colaboran y crecen juntos.

# Definición Completa del Sistema

**Nombre del Sistema:** Plataforma Instagram para Publicar Fotografías.

**Propósito del Sistema:**
Esta plataforma permite a los usuarios no solo compartir contenido visual como fotografías, sino también interactuar de manera multifacética con ese contenido. Facilita un espacio para la autoexpresión y la construcción de comunidades, donde cada interacción contribuye al tejido social de la red.

## Funcionalidades Principales:

- **Creación de Perfil:** Cada usuario configura su espacio personal donde puede gestionar su identidad digital y sus obras.
- **Publicación de Contenido:** Los usuarios cargan sus creaciones digitales, que son accesibles a su red y acompañadas de descripciones que añaden contexto o narrativa.
- **Interacción con Contenido:** Incluye la capacidad de 'likear', comentar, y compartir las obras, lo que fomenta una comunidad activa y participativa.
- **Gestión de Seguidores:** Los usuarios pueden seguir a otros para recibir actualizaciones de sus últimas publicaciones, simulando un seguimiento de artistas favoritos en un estudio real.

# Definición de las Clases del Sistema

## Clase Usuario

**Responsabilidades:**
- Gestionar información personal y de seguridad (nombre, contraseña).
- Administrar su perfil y las interacciones dentro de este.
- Crear y gestionar publicaciones, comentarios y reacciones.
- Seguir a otros usuarios y gestionar seguidores.

**Colaboradores:**
- Perfil
- Publicación
- Reacción
- Comentario
- Compartición

## Clase Perfil

**Responsabilidades:**
- Mantener y mostrar el catálogo de obras publicadas por el usuario.
- Gestionar la lista de seguidores y seguimientos.
- Proveer métodos para agregar nuevas obras (publicaciones) y gestionar interacciones.

**Colaboradores:**
- Usuario
- Publicación

## Clase Publicación

**Responsabilidades:**
- Almacenar detalles de la obra como la imagen, descripción y autor.
- Facilitar la interacción directa a través de comentarios, reacciones y comparticiones.

**Colaboradores:**
- Usuario
- Comentario
- Reacción
- Compartición