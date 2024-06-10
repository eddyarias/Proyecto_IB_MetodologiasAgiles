## Pruebas Funcionales

---

### HU8: Prueba de Funcionalidad: Comentar Publicación

| **Nombre de la Prueba** | Comentar Publicación |
|-------------------------|----------------------|
| **Descripción**         | Verificar que un usuario registrado pueda comentar en las publicaciones de otros usuarios. |
| **Precondiciones**      | - El usuario debe estar registrado e iniciar sesión en el sistema. <br> - Debe existir al menos una publicación realizada por otro usuario. |
| **Datos de Entrada**    | - Selección de la publicación. <br> - Texto del comentario. |
| **Pasos para Ejecutar la Prueba** | 1. El usuario inicia sesión en el sistema. <br> 2. El usuario selecciona una publicación de otro usuario. <br> 3. El usuario ingresa el texto para la publicación `¡Excelente publicación!`. <br> 4. El usuario envía el comentario. |
| **Resultado Esperado**  | - El comentario se agrega a la publicación seleccionada. <br> - El comentario es visible junto a la publicación. |
| **Resultado Real**      | - ![H24](C:\Users\irmr\Documents\6tosemestre\Metodologias\Artefactos\Imagenes\Iteracion_II\HU24.png) |
| **Estado de la Prueba** | - (Pasó) |
| **Comentarios**         | - El resuldo obtenido es el resultado esperado, por ello es una prueba exitosa |

---

### HU9: Prueba de Funcionalidad: Reaccionar a Publicación

| **Nombre de la Prueba** | Reaccionar a Publicación |
|-------------------------|-------------------------|
| **Descripción**         | Verificar que un usuario registrado pueda reaccionar a las publicaciones de otros usuarios. |
| **Precondiciones**      | - El usuario debe estar registrado e iniciar sesión en el sistema. <br> - Debe existir al menos una publicación realizada por otro usuario. |
| **Datos de Entrada**    | - Selección de la publicación. <br> - Realización de una reacción (por ejemplo, 'like'). |
| **Pasos para Ejecutar la Prueba** | 1. El usuario inicia sesión en el sistema. <br> 2. El usuario selecciona una publicación de otro usuario. <br> 3. El usuario realiza una reacción `LIKE`. |
| **Resultado Esperado**  | - La reacción se agrega a la publicación seleccionada. <br> - La reacción es contabilizada y visible en el perfil del usuario que comparte. |
| **Resultado Real**      | - ![H25](C:\Users\irmr\Documents\6tosemestre\Metodologias\Artefactos\Imagenes\Iteracion_II\HU25.png) |
| **Estado de la Prueba** | - (Pasó) |
| **Comentarios**         | - El resuldo obtenido es el resultado esperado, por ello es una prueba exitosa |

---

### HU10: Prueba de Funcionalidad: Compartir Publicación

| **Nombre de la Prueba** | Compartir Publicación |
|-------------------------|-----------------------|
| **Descripción**         | Verificar que un usuario registrado pueda compartir publicaciones de otros usuarios en su perfil. |
| **Precondiciones**      | - El usuario debe estar registrado e iniciar sesión en el sistema. <br> - Debe existir al menos una publicación realizada por otro usuario. |
| **Datos de Entrada**    | - Selección de la publicación a compartir. |
| **Pasos para Ejecutar la Prueba** | 1. El usuario inicia sesión en el sistema. <br> 2. El usuario selecciona una publicación de otro usuario para compartir. <br> 3. El usuario comparte la publicación. |
| **Resultado Esperado**  | - La publicación compartida incluye un enlace único. <br> - La publicación es visible en el perfil del usuario que comparte. <br> - El usuario recibe una notificación de `FOTO COMPARTIDA EXITOSAMENTE`. |
| **Resultado Real**      | - ![H24](C:\Users\irmr\Documents\6tosemestre\Metodologias\Artefactos\Imagenes\Iteracion_II\HU26.png) |
| **Estado de la Prueba** | - (Pasó) |
| **Comentarios**         | - El resuldo obtenido es el resultado esperado, por ello es una prueba exitosa |
