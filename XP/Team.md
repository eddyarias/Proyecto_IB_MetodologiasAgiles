# Titans Tech - Grupo 1
![alt text](Planing/img/logo.png)
## Equipo
### Cliente
- **Kevin Asimbaya**

### eXtreme-Teamwork
- **Santiago Bejarano**
- **Edwin Cantuña**
- **Erika Anrrango**
- **Eddy Arias**
- **Ismael Toala**
- **Esteban Bajaña**

## Metáfora general del sistema

**"Galería de arte digital interactiva"**: Esta metáfora representa el sistema como una galería de arte en línea donde cada usuario tiene su propia sala de exhibición (**perfil**), llena de sus obras visuales (**publicaciones**). En esta galería, los visitantes pueden explorar las salas de diferentes artistas (**otros usuarios**), interactuar con las obras mediante comentarios y 'me gusta', además, pueden llevarse copias de las obras que les inspiran (**comparticiones**). La galería no solo es un espacio para exhibir y admirar el arte, sino un **entorno dinámico** y comunitario donde los artistas y espectadores interactúan, colaboran y se inspiran mutuamente en un ambiente digital moderno.

### Definición Completa del Sistema

**Nombre del Sistema:** Plataforma Instagram para publicar fotografías.

**Propósito del Sistema:**
La plataforma permite a los usuarios compartir y explorar contenido visual, fomentando una comunidad activa y participativa donde se pueden admirar, comentar y compartir obras digitales. 

### Funcionalidades Principales:

- **Creación de Perfil:** Cada usuario configura su sala de exhibición personal donde administra su identidad y sus obras.
- **Publicación de Contenido:** Los usuarios pueden cargar fotos y descripciones para exponer sus creaciones a su comunidad.
- **Exploración e Interacción con Publicaciones**: Los usuarios pueden visitar las salas de otros, explorar sus obras, y dejar comentarios, 'me gusta' y compartir el contenido.
- **Gestión de Seguidores**: Los usuarios pueden seguir a otros para recibir actualizaciones, formando una red de artistas y admiradores.

### Definición de las Clases del Sistema

#### Clase Usuario

**Responsabilidades**:
- Administrar su información personal y de seguridad.
- Gestionar su perfil y las interacciones dentro de la plataforma.
- Crear y administrar sus publicaciones, comentarios y reacciones.
- Gestionar su red de seguidores y seguidos.

**Colaboradores**:
- Perfil
- Publicación
- Comentario
- Reacción
- Compartición

#### Clase Perfil

**Responsabilidades**:
- Mantener y mostrar las publicaciones del usuario.
- Gestionar seguidores y seguimientos.
- Facilitar la adición de nuevas publicaciones y la gestión de interacciones con ellas.

**Colaboradores**:
- Usuario
- Publicación

#### Clase Publicación

**Responsabilidades**:
- Almacenar detalles de cada publicación, incluyendo imagen, descripción y autor.
- Facilitar la interacción a través de comentarios, reacciones y comparticiones.

**Colaboradores**:
- Usuario
- Comentario
- Reacción
- Compartición
