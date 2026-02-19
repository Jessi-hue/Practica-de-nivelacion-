

# 3. PROGRAMACIÓN

## 15. Tipos primitivos en Java

En Java existen los siguientes tipos de datos primitivos:

- `byte`
- `short`
- `int`
- `long`
- `float`
- `double`
- `char`
- `boolean`

---

## 16. Estructuras de control

- `if / else`: ejecutan decisiones basadas en condiciones.
- `switch`: evalúa múltiples casos posibles.
- `for`, `while` y `do-while`: repiten instrucciones mediante bucles.

---

## 17. Importancia de nombres significativos

El uso de nombres significativos en variables, métodos y clases mejora la **legibilidad** y el **mantenimiento** del código.

---

## 18. Programación Orientada a Objetos (POO)

La **Programación Orientada a Objetos (POO)** es un paradigma basado en objetos que contienen datos (atributos) y métodos (comportamientos).

---

## 19. Los cuatro pilares de la POO

Los cuatro pilares fundamentales son:

- Encapsulamiento
- Abstracción
- Herencia
- Polimorfismo

---
## 20. Herencia en Java

La herencia permite que una clase herede atributos y métodos de otra utilizando la palabra clave `extends`.

Ejemplo:

```java
class Animal {
    String nombre;
    
    void hacerSonido() {
        System.out.println("Sonido del animal");
    }
}

class Perro extends Animal {
    void ladrar() {
        System.out.println("Guau");
    }
}
```

---

## 21. Modificadores de acceso

En Java existen los siguientes modificadores de acceso:

- `public`: accesible desde cualquier clase.
- `private`: accesible solo dentro de la misma clase.
- `protected`: accesible dentro del mismo paquete y por herencia.
- `default`: accesible solo dentro del mismo paquete.

---

## 22. Variable de entorno

Una **variable de entorno** es un valor configurado en el sistema que influye en el comportamiento de los programas.

Un ejemplo común es:

- `JAVA_HOME`