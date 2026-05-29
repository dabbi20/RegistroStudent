# Sistema de Registro de Estudiantes en Java

## Descripción

Este proyecto es una aplicación de consola desarrollada en Java que permite registrar estudiantes, almacenar sus datos básicos y realizar operaciones sencillas como mostrar registros, buscar estudiantes por nombre y calcular el promedio general de notas.

El sistema utiliza arreglos para guardar la información de los estudiantes y un menú interactivo para que el usuario pueda seleccionar las diferentes opciones disponibles.

## Funcionalidades

* Registrar estudiantes.
* Guardar nombre, edad y calificación.
* Mostrar la lista de estudiantes registrados.
* Buscar un estudiante por nombre.
* Calcular el promedio general de notas.
* Salir del sistema mediante una opción del menú.

## Tecnologías utilizadas

* Java
* Scanner
* Arreglos
* Estructuras de control
* Ciclos
* Métodos estáticos

## Estructura del programa

El programa está desarrollado dentro de la clase:

```java
RegistrarEstudiantes
```

Dentro de esta clase se utilizan los siguientes arreglos:

```java
static String[] nombres = new String[100];
static int[] edades = new int[100];
static double[] notas = new double[100];
```

Estos arreglos permiten almacenar hasta 100 estudiantes.

También se utiliza la variable:

```java
static int contador = 0;
```

Esta variable controla cuántos estudiantes han sido registrados.

## Menú principal

El sistema muestra un menú con las siguientes opciones:

```text
1. Registrar estudiante
2. Mostrar estudiantes
3. Buscar estudiante
4. Promedio de notas
5. Salir del sistema
```

## Métodos principales

### registrarEstudiante()

Solicita al usuario el nombre, la edad y la calificación del estudiante. Luego guarda esos datos en los arreglos correspondientes.

### mostrarEstudiantes()

Recorre los arreglos y muestra todos los estudiantes registrados hasta el momento.

### buscarEstudiante()

Solicita un nombre al usuario y busca si existe dentro del arreglo de nombres. La búsqueda no distingue entre mayúsculas y minúsculas.

### calcularPromedio()

Suma todas las notas registradas y calcula el promedio dividiendo la suma entre la cantidad de estudiantes registrados.

## Posibles mejoras

* Validar que no se registren más de 100 estudiantes.
* Validar que la edad sea un número positivo.
* Validar que la nota esté dentro de un rango permitido, por ejemplo de 0 a 5.
* Evitar calcular el promedio si no hay estudiantes registrados.
* Reemplazar arreglos por `ArrayList` para permitir crecimiento dinámico.
* Crear una clase `Estudiante` para aplicar programación orientada a objetos.
* Mejorar el formato de impresión de los estudiantes.

## Ejemplo de uso

```text
*** Menu Principal ***
1. Registrar estudiante
2. Mostrar estudiantes
3. Buscar estudiante
4. Promedio de notas
5. Salir del sistema

Seleccione una opción: 1
Por favor ingresa el nombre:
Carlos
Por favor ingresa la edad:
20
Por favor ingresa la calificacion:
4.5
```

## Autor

Proyecto académico desarrollado como práctica de fundamentos de Java David Carrasco.
