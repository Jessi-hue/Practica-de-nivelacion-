Taller Parte Teórico 


# Taller Parte Teórico

## Jessica Alejandra Canchala

**Asignatura:** Markdown, Git y Programación  
**Docente:** Gabriel Perez Moreno  

**Institución Universitaria Antonio José Camacho**  
Facultad de Ingenierías  
Tecnología en Sistemas de la Información  
Grupo 412  
Cali - Colombia  
2026  

---

## PARTE 1 - TEORÍA

## 1. ¿Qué es Markdown?

Markdown es un lenguaje de marcado ligero que permite dar formato a texto utilizando una sintaxis sencilla. Se utiliza comúnmente para documentación, archivos README y contenido web.

---

# 2. GIT

## 2.1 ¿Qué es un repositorio en Git?

Un repositorio en Git es un espacio donde se almacenan los archivos del proyecto junto con el historial de cambios. A diferencia de un proyecto normal, el repositorio registra versiones, cambios y permite trabajo colaborativo.

## 2.2 ¿Cuáles son las tres áreas principales de Git?

Las tres áreas principales son:

- **Working Directory:** Directorio de trabajo donde se editan archivos.
- **Staging Area (Index):** Área intermedia donde se preparan cambios.
- **Repository:** Base de datos donde se guardan los commits.

## 2.3 ¿Cómo representa Git los cambios internamente?

Git representa los cambios mediante objetos:

- **blob:** Contenido de archivo.
- **tree:** Estructura de directorios.
- **commit:** Registro de cambios.
- **tag:** Referencia a un commit específico.


## 4. ¿Cómo se crea un commit?

Un commit se crea con el comando `git commit` y almacena información como el autor, la fecha, un mensaje descriptivo y la referencia al commit padre.

---

## 5. Diferencia entre `git fetch` y `git pull`

El comando `git fetch` descarga los cambios del repositorio remoto sin fusionarlos con la rama actual.  
En cambio, `git pull` descarga los cambios y los fusiona automáticamente.

---

## 6. ¿Qué es un branch?

Un **branch** (rama) es un puntero a un commit.  
Git gestiona las ramas como referencias móviles que apuntan a distintos commits dentro del historial del proyecto.

---

## 7. ¿Cómo funciona `git merge`?

El comando `git merge` combina ramas.  
Pueden surgir conflictos cuando se modifican las mismas líneas en diferentes ramas.  
Estos conflictos se resuelven editando manualmente los archivos y realizando un nuevo commit.

---

## 8. ¿Cómo funciona `git add`?

El comando `git add` mueve los cambios al área de *staging*.  
Si se omite este paso, los cambios no se incluirán en el commit.

---

## 9. ¿Qué es `.gitignore`?

El archivo `.gitignore` indica qué archivos o carpetas no deben ser rastreados por Git.

---

## 10. Diferencia entre `--amend` y un nuevo commit

La opción `git commit --amend` modifica el último commit realizado.  
En cambio, un nuevo `git commit` crea un commit adicional en el historial.

---

## 11. ¿Qué es `git stash`?

El comando `git stash` guarda cambios temporales sin necesidad de hacer un commit.

---

## 12. Mecanismos para deshacer cambios

Git ofrece varios mecanismos:

- `git reset`: deshace commits.
- `git revert`: crea un commit inverso.
- `git checkout`: cambia de rama o restaura archivos.

---

## 13. Configuración de remotos

- `origin` es el remoto principal.
- `upstream` es el repositorio original en caso de un fork.

Se gestionan mediante el comando `git remote`.

---

## 14. Inspección del historial

- `git log` muestra el historial de commits.
- `git diff` muestra diferencias entre cambios.
- `git show` muestra los detalles de un commit específico.

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

