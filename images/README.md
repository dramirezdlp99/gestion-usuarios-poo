# Gestión de Usuarios - API Universidad (POO)

Este proyecto es una implementación de una API REST utilizando **Spring Boot**, diseñada bajo los principios de la **Programación Orientada a Objetos (POO)**. Se enfoca en el uso de herencia, interfaces y arquitectura por capas.

**Desarrollado por:** David Ramírez de la Parra

---

## 🛠️ Tecnologías Utilizadas
* **Java 21**
* **Spring Boot 3.4.x**
* **Maven** (Gestor de dependencias)
* **PlantUML** (Modelado de diagramas)
* **Postman** (Pruebas de API)

## 🏗️ Arquitectura del Proyecto
El sistema sigue un patrón de diseño por capas para asegurar la escalabilidad y el orden:
1. **Controller**: Maneja los puntos de entrada (Endpoints) de la API.
2. **Service**: Contiene la lógica de negocio y orquestación de objetos.
3. **Model**: Define las entidades (`Persona`, `Estudiante`, etc.) y los contratos (Interfaces como `Notificable` y `Autenticable`).

## 🚀 Conceptos de POO Aplicados
* **Herencia**: Las clases `Estudiante`, `Profesor` y `Administrativo` heredan de la clase abstracta `Persona`.
* **Interfaces**: Implementación de comportamientos como `Autenticable`, `Notificable`, `Evaluador` y `Aprobador`.
* **Encapsulamiento**: Protección de datos mediante modificadores de acceso.

## 📡 Pruebas de Endpoints (Puerto 9096)

### 1. Notificaciones
Simulación de envío de mensajes al sistema.
![Prueba Notificación](./images/Captura%20de%20pantalla%20(1108).png)

### 2. Autenticación (Login)
Validación de credenciales de usuario.
* **Éxito:**
  ![Login Correcto](./images/Captura%20de%20pantalla%20(1110).png)
* **Fallo:**
  ![Login Incorrecto](./images/Captura%20de%20pantalla%20(1109).png)

---

## 📊 Diagrama UML de Clases
A continuación se presenta el modelo estructural del sistema:
![Diagrama UML](./images/DIAGRAMA%20UML%20POR%20CAPAS%20-%20UNIVERSIDAD.png)