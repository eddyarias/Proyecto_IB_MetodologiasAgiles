# Pruebas Funcionales para Instagram en Consola

---

### HU1: Registro de Usuario

| **Nombre de la Prueba** | Registro de Usuario |
|-------------------------|---------------------|
| **Descripción**         | Verifica que un nuevo usuario puede registrarse ingresando un nombre de usuario y contraseña únicos. |
| **Precondiciones**      | - El sistema no debe contener un usuario con el mismo nombre de usuario. |
| **Datos de Entrada**    | - Nombre de usuario: `testUser` <br> - Contraseña: `testPassword` |
| **Pasos para Ejecutar la Prueba** | 1. Ejecutar el método para crear un nuevo usuario con el nombre `testUser` y la contraseña `testPassword`. <br> 2. Verificar si el usuario ha sido agregado a la lista de usuarios. |
| **Resultado Esperado**  | - Mensaje de confirmación: `Usuario creado exitosamente.` |

---

### HU2: Inicio de Sesión

| **Nombre de la Prueba** | Inicio de Sesión |
|-------------------------|------------------|
| **Descripción**         | Verifica que un usuario registrado puede iniciar sesión seleccionando su nombre de la lista de usuarios. |
| **Precondiciones**      | - El usuario `testUser` debe estar registrado en el sistema. |
| **Datos de Entrada**    | - Seleccionar el nombre del usuario |
| **Pasos para Ejecutar la Prueba** | 1. Mostrar la lista de usuarios registrados. <br> 2. Seleccionar el nombre del usuario `testUser`. |
| **Resultado Esperado**  | - Mensaje de confirmación: `¡Bienvenido, testUser!` |

---

### HU3: Publicar Contenido

| **Nombre de la Prueba** | Publicar Contenido |
|-------------------------|--------------------|
| **Descripción**         | Verifica que un usuario registrado puede publicar imágenes con descripciones. |
| **Precondiciones**      | - El usuario debe estar registrado e iniciar sesión. <br> - Debe haber imágenes disponibles en un directorio predefinido. |
| **Datos de Entrada**    | - Descripción de la imagen: Mi primera publicación |
| **Pasos para Ejecutar la Prueba** | 1. Seleccionar una imagen del directorio. <br> 2. Ingresar una descripción para la imagen. <br> 3. Se publica la imagen. |
| **Resultado Esperado**  | - Mensaje de confirmación: `Publicación realizada con éxito` |

---

### HU4: Seguir a Otros Usuarios

| **Nombre de la Prueba** | Seguir a Otros Usuarios |
|-------------------------|-------------------------|
| **Descripción**         | Verifica que un usuario registrado puede seguir a otros usuarios. |
| **Precondiciones**      | - El usuario debe estar registrado e iniciar sesión. <br> - Debe haber otros usuarios disponibles para seguir. |
| **Datos de Entrada**    | - Usuario a seguir: `user1` |
| **Pasos para Ejecutar la Prueba** | 1. Listar todos los usuarios disponibles para seguir. <br> 2. Seleccionar el usuario `user1` para seguir. |
| **Resultado Esperado**  | - Mensaje de confirmación: `Has comenzado a seguir a user1` |

---

### HU5: Ver Perfil

| **Nombre de la Prueba** | Ver Perfil |
|-------------------------|------------|
| **Descripción**         | Verifica que un usuario registrado puede ver su perfil o el de otros usuarios, incluyendo información de seguidores y publicaciones. |
| **Precondiciones**      | - El usuario debe estar registrado e iniciar sesión. <br> - Deben existir otros usuarios con publicaciones y seguidores. |
| **Datos de Entrada**    | - Usuario cuyo perfil se va a ver: `testUser` |
| **Pasos para Ejecutar la Prueba** | 1. Seleccionar el perfil del usuario `testUser`. <br> 2. Verificar la información del perfil, incluyendo el número de seguidores y la cantidad de publicaciones. <br> 3. Listar todas las publicaciones del perfil seleccionado. |
| **Resultado Esperado**  | - Información del perfil: `Número de seguidores: 0, Cantidad de publicaciones: 1` |

---

### HU6: Ver Seguidores

| **Nombre de la Prueba** | Ver Seguidores |
|-------------------------|----------------|
| **Descripción**         | Verifica que un usuario registrado puede ver la lista de sus seguidores. |
| **Precondiciones**      | - El usuario debe estar registrado e iniciar sesión. <br> - Debe haber usuarios que sigan al usuario. |
| **Datos de Entrada**    | - Usuario que sigue: `testUser` <br> - Usuario seguido: `user1` |
| **Pasos para Ejecutar la Prueba** | 1. Seguir al usuario `user1` con el usuario `testUser`. <br> 2. Ver la lista de seguidores del usuario `user1`. |
| **Resultado Esperado**  | - Lista de seguidores: `testUser` |

---

### HU7: Salir de la Sesión

| **Nombre de la Prueba** | Salir de la Sesión |
|-------------------------|--------------------|
| **Descripción**         | Verifica que un usuario registrado puede cerrar su sesión. |
| **Precondiciones**      | - El usuario debe estar registrado e iniciar sesión. |
| **Datos de Entrada**    | - Confirmación para salir: sí |
| **Pasos para Ejecutar la Prueba** | 1. Seleccionar la opción para salir de la sesión. <br> 2. Confirmar la acción de salir. |
| **Resultado Esperado**  | - Mensaje de despedida: `Sesión cerrada. Hasta luego` |
