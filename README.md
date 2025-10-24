# 👋 Saludador (HelloFormCompose)

## 🧩 Descripción
**Saludador** es una aplicación Android creada con **Jetpack Compose** que permite escribir un nombre, pulsar un botón y mostrar un saludo personalizado.  
A diferencia de la versión clásica con XML, toda la interfaz se construye usando **Kotlin declarativo**.

---

## 🎯 Objetivo
Practicar el desarrollo con **Jetpack Compose** creando un formulario simple que:
- Reciba texto del usuario mediante un `TextField`.  
- Reaccione a un evento de clic en un `Button`.  
- Actualice la interfaz de forma reactiva con un `Text`.  
- Use **estado** con `rememberSaveable` para mantener los datos ante cambios de configuración.

---

### 1️⃣ Proyecto
- **Nombre:** `HelloFormCompose`  
- **Plantilla:** Empty Activity (Kotlin)

### 2️⃣ Punto de entrada — `MainActivity.kt`
- Define el contenido de la UI dentro de `setContent { ... }`.  
- Llama a un composable principal, por ejemplo:  
```kotlin
setContent {
    HelloForm()
}
```

### 3️⃣ Composable principal — `HelloForm()`

Crea un formulario con los siguientes elementos:

- `TextField` → para introducir el nombre.
- `Button` → con el texto **"Saludar"**.
- `Text` → para mostrar el resultado.

Usa `rememberSaveable` para guardar el estado del nombre y el mensaje.

---

### ⚙️ Comportamiento esperado

Al presionar el botón:

- Si el campo está vacío → mostrar **"Introduce tu nombre"**.
- Si tiene texto → mostrar **"👋 Hola, <nombre>"**.

---

### 🧠 Ejemplo de comportamiento

| Entrada del usuario | Resultado mostrado |
|--------------------|------------------|
| *(vacío)*          | Introduce tu nombre |
| Juan               | 👋 Hola, Juan       |

---

### 🛠️ Requisitos

- **Android Studio** (Arctic Fox o superior)  
- **SDK mínimo:** API 24 (Android 7.0 Nougat)  
- **Lenguaje:** Kotlin  
- **UI Toolkit:** Jetpack Compose

## 🧱 Estructura del proyecto
```
HelloFormCompose/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/helloformcompose/MainActivity.kt
│   │   │   ├── res/values/strings.xml
│   │   │   └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
└── README.md
```

## Autor
Este proyecto ha sido desarrollado por Juan Antonio "Toño" Tejera González.  

Github de Toño: [![Web](https://img.shields.io/badge/GitHub-tonodevep-14a1f0?style=for-the-badge&logo=github&logoColor=white&labelColor=101010)](https://github.com/tonodevep/)

