# Metáfora del Sistema

**"Un álbum digital interactivo"**: Esta metáfora representa el sistema como un espacio personal y comunitario donde los usuarios pueden coleccionar y compartir sus momentos capturados, similar a cómo un álbum de fotos físico permite la visualización de recuerdos, pero enriquecido con interacciones digitales y una experiencia de usuario moderna.

# Definición Completa del Sistema

**Nombre del Sistema:** Plataforma Instagram para Publicar Fotografíasl.

**Propósito del Sistema:**
El sistema permite a los usuarios crear perfiles personales para administrar y compartir contenido visual como fotos y videos. Esta plataforma ofrece una experiencia centrada en la visualización y la interacción sencilla con el contenido fotográfico, fomentando la conexión y la comunidad entre usuarios con intereses visuales similares.

## Funcionalidades Principales:

- **Creación de Perfil:** Los usuarios pueden establecer y configurar sus perfiles personales, lo cual incluye autenticación para proteger y personalizar su espacio.
- **Publicación de Contenido:** Los usuarios pueden cargar  fotos, añadiendo descripciones para contextualizar o narrar historias.
- **Visualización de Publicaciones:** Permite a los usuarios explorar las publicaciones en su propio perfil, facilitando un recorrido visual por sus momentos compartidos.

# Definición de las Clases del Sistema

## Clase Usuario

**Responsabilidades:**
- Manejar información del usuario.
- Gestionar el perfil de usuario.
- Interactuar con publicaciones.
- Gestionar seguidores y seguidos.
- Gestionar archivos de directorio.

**Colaboradores:**
- Perfil
- Publicación

## Clase Perfil

**Responsabilidades:**
- Gestionar publicaciones del perfil.
- Mostrar contenido de publicaciones.
- Incrementar el número de seguidores.
- Obtener y mostrar seguidores.
- Agregar seguidores.

**Colaboradores:**
- Usuario
- Publicación

## Clase Publicación

**Responsabilidades:**
- Almacenar y gestionar la información de una publicación (autor, foto, descripción).
- Facilitar la recuperación de la información de la publicación.

**Colaboradores:**
- Usuario