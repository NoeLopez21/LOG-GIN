# 📘 LOG-GIN – Sistema de Inicio de Sesión para Aplicaciones Java Desktop

---

## 🔷 Nombre del Proyecto:
**LOG-GIN – Sistema de Login para escritorio en Java Swing**

---

## 🧾 Descripción General

`LOG-GIN` es un sistema de inicio de sesión desarrollado en **Java**, orientado a aplicaciones de escritorio con interfaz gráfica construida en **Java Swing**. El objetivo de este proyecto es proporcionar un módulo funcional y seguro que pueda integrarse a sistemas más grandes, como plataformas de gestión, administrativos o escolares.

Cuenta con validación de usuario y contraseña, conexión directa con base de datos **MySQL**, verificación en tiempo real, y navegación hacia el menú principal si las credenciales son correctas.

Este sistema es parte de una arquitectura escalable, pensado para ser el **primer filtro de autenticación de usuarios en cualquier aplicación Java profesional.**

---

## 🎯 Objetivo del Sistema

- Proporcionar una interfaz intuitiva para el acceso al sistema.
- Validar credenciales de forma segura contra una base de datos.
- Redirigir al usuario al panel principal si las credenciales son correctas.
- Bloquear acceso si los datos son incorrectos o faltantes.
- Permitir la integración con futuros módulos como “Panel de administración”, “Dashboard de usuarios”, etc.

---

## 🛠️ Tecnologías y Herramientas Usadas

| Herramienta     | Uso principal                                  |
|-----------------|------------------------------------------------|
| **Java SE**     | Lógica de programación                         |
| **Java Swing**  | Interfaz gráfica de usuario                    |
| **MySQL**       | Almacenamiento de credenciales de usuarios     |
| **NetBeans**    | Entorno de desarrollo integrado (IDE)          |
| **JDBC**        | Conexión entre Java y MySQL                    |

---

## 🔐 Características del Sistema

- Inicio de sesión con verificación en base de datos
- Campos obligatorios (usuario y contraseña)
- Diseño moderno con interfaz visual amigable
- Navegación hacia el panel principal
- Código modular y reutilizable
- Validación en tiempo real y mensajes de error descriptivos

---

## 🧠 Lógica de funcionamiento (resumen técnico)

1. El usuario ingresa su **nombre de usuario** y **contraseña** en los campos del formulario `Login.java`.
2. Se realiza una conexión a la base de datos mediante la clase `ConexionBD.java`.
3. Se ejecuta una consulta SQL que compara los datos ingresados con los registros en la tabla `usuarios`.
4. Si la verificación es exitosa:
   - Se abre la ventana del menú principal (`Menu.java`)
   - Se cierra la ventana de login
5. Si los datos son incorrectos o vacíos:
   - Se muestra un mensaje de error y se solicita corrección

---

## 📁 Estructura del Proyecto

## 🖼️ Capturas del Sistema

### 🟢 Inicio de sesión
![Imagen uno](https://github.com/NoeLopez21/LOG-GIN/raw/main/imagenes%20farmacia/Imagen%20uno.png)

### ❌ Datos inválidos
![Imagen dos](https://github.com/NoeLopez21/LOG-GIN/raw/main/imagenes%20farmacia/Imagen%20dos.png)

### ✅ Acceso correcto al menú
![Imagen tres](https://github.com/NoeLopez21/LOG-GIN/raw/main/imagenes%20farmacia/Imagen%20tres.png)

### Vista adicional
![Imagen cuatro](https://github.com/NoeLopez21/LOG-GIN/raw/main/imagenes%20farmacia/Imagen%20cuatro.png)

![Imagen cinco](https://github.com/NoeLopez21/LOG-GIN/raw/main/imagenes%20farmacia/Imagen%20cinco.png)
![Imagen seis](https://github.com/NoeLopez21/LOG-GIN/raw/main/imagenes%20farmacia/Imagen%20seis.png)
![Imagen siete](https://github.com/NoeLopez21/LOG-GIN/raw/main/imagenes%20farmacia/Imagen%20siete.png)
![Imagen ocho](https://github.com/NoeLopez21/LOG-GIN/raw/main/imagenes%20farmacia/Imagen%20ocho.png)
![Imagen nueve](https://github.com/NoeLopez21/LOG-GIN/raw/main/imagenes%20farmacia/Imagen%20nueve.png)
![Imagen diez](https://github.com/NoeLopez21/LOG-GIN/raw/main/imagenes%20farmacia/Imagen%20diez.png)
![Imagen once](https://github.com/NoeLopez21/LOG-GIN/raw/main/imagenes%20farmacia/Imagen%20once.png)
![Imagen doce](https://github.com/NoeLopez21/LOG-GIN/raw/main/imagenes%20farmacia/Imagen%20doce.png)
![Imagen trece](https://github.com/NoeLopez21/LOG-GIN/raw/main/imagenes%20farmacia/Imagen%20trece.png)
![Imagen catorce](https://github.com/NoeLopez21/LOG-GIN/raw/main/imagenes%20farmacia/Imagen%20catorce.png)

---


