# DAM - Programación

Repositorio personal de ejercicios, prácticas y exámenes de **Programación** del ciclo formativo de **Desarrollo de Aplicaciones Multiplataforma (DAM)**.

El proyecto está preparado para abrirse con IntelliJ IDEA como proyecto Maven. Los ejercicios conservan, en general, su organización y nombres originales para que puedan ejecutarse de forma independiente.

## Índice

- [Contenido](#contenido)
- [Estructura](#estructura)
- [Requisitos](#requisitos)
- [Configuración](#configuración)
- [Compilar y ejecutar](#compilar-y-ejecutar)
- [Datos y recursos](#datos-y-recursos)
- [Estado del repositorio](#estado-del-repositorio)
- [Convenciones](#convenciones)
- [Licencia](#licencia)

## Contenido

Los ejercicios están agrupados por bloques de aprendizaje:

| Ruta | Contenido |
| --- | --- |
| `src/A` - `src/E` | Fundamentos de Java, clases, objetos, herencia, arrays y estructuras de control |
| `src/F` - `src/H` | Cadenas, búsqueda, cifrado, fechas, DNI y otros ejercicios de lógica |
| `src/I` | Ficheros, directorios y operaciones de entrada/salida |
| `src/J` - `src/K` | Ejercicios de modelado y gestión de información |
| `src/L` | Colecciones, expresiones lambda y programación funcional |
| `src/M` | Acceso a datos, DAO, H2 y práctica de pizzería |
| `src/N` | Interfaces gráficas y calculadoras |
| `src/Examenes` | Exámenes y ejercicios de evaluación |
| `src/ExamenesMGL` | Evaluaciones, simulacros y prácticas de examen |
| `src/HundirLaFlota` | Proyecto de consola de Hundir la Flota |

También hay clases auxiliares compartidas en la raíz de `src`, como `Teclado` y `TecladoGrafico`.

## Estructura

```text
DAM-Programacion/
├── src/
│   ├── A/ ... N/          # Ejercicios organizados por bloques
│   ├── Examenes/          # Exámenes
│   ├── ExamenesMGL/       # Evaluaciones y simulacros
│   ├── HundirLaFlota/     # Proyecto de consola
│   ├── Teclado.java       # Utilidad de entrada
│   └── TecladoGrafico.java
├── data/                  # Base de datos H2 utilizada por algunas prácticas
├── pom.xml                # Configuración Maven
├── DAM-Programacion.iml  # Configuración de IntelliJ IDEA
├── LICENSE
└── README.md
```

El `pom.xml` define `src` como directorio de código fuente para mantener esta organización académica. Por ese motivo no se utiliza la estructura Maven convencional `src/main/java`.

## Requisitos

- **JDK 21**.
- **Apache Maven** 3.8 o posterior.
- **IntelliJ IDEA** (recomendado para seleccionar y ejecutar cada ejercicio).
- Conexión a Internet durante la primera compilación para descargar dependencias.

Dependencias declaradas en Maven:

- **Lombok 1.18.42**, con alcance `provided`.
- **H2 Database 2.3.232**, con alcance `runtime`.

## Configuración

1. Clona el repositorio y ábrelo en IntelliJ IDEA.
2. Importa el proyecto como proyecto Maven.
3. Configura el SDK del proyecto y Maven para utilizar JDK 21.
4. Activa el procesamiento de anotaciones si IntelliJ lo solicita para los ejercicios que utilizan Lombok.
5. Conserva como directorio de trabajo la raíz del repositorio, salvo que el ejercicio indique una ruta relativa distinta.

## Compilar y ejecutar

Desde la raíz del repositorio:

```bash
mvn compile
```

Para eliminar los archivos generados y compilar de nuevo:

```bash
mvn clean compile
```

La forma recomendada de ejecutar un ejercicio es abrir en IntelliJ IDEA la clase que contiene `main` y utilizar **Run**. Algunos ejemplos son:

| Ejercicio | Clase principal |
| --- | --- |
| Hundir la Flota | `HundirLaFlota.Main` |
| Práctica de pizzería | `M.Pizzeria.Pizzeria` |
| DAO de personas | `M.M1.Main` |
| DAO de coches | `M.M2.ui.Main` |
| Calculadora | `N.N2.Calculadora` |

También es posible ejecutar una clase compilada desde la línea de comandos:

```bash
java -cp target/classes HundirLaFlota.Main
```

El nombre completo de la clase depende del paquete declarado en cada ejercicio. Si una práctica no encuentra un fichero de entrada, revisa el **Working directory** de la configuración de ejecución de IntelliJ.

## Datos y recursos

La carpeta `data/` contiene archivos de la base de datos H2 usados por algunas prácticas de acceso a datos. No la elimines mientras ejecutes esos ejercicios.

Los ejercicios pueden incluir recursos locales, como imágenes, fuentes, documentos o archivos comprimidos. Mantén el directorio de trabajo esperado por cada práctica para que sus rutas relativas funcionen correctamente.

Los directorios `target/` y `out/` son generados por las herramientas de compilación y están excluidos del control de versiones.

## Estado del repositorio

Este repositorio tiene finalidad académica. Contiene ejercicios de distinta complejidad y grado de finalización:

- Los bloques `A` a `N` reúnen ejercicios independientes y prácticas de clase.
- `Examenes` y `ExamenesMGL` contienen enunciados, soluciones y simulacros.
- Algunas clases son borradores o dependen de recursos externos; no todos los ejercicios representan una aplicación terminada.
- Las prácticas de acceso a datos pueden modificar la base de datos local de `data/`.

## Convenciones

- Los paquetes siguen la organización por bloque y ejercicio.
- Se mantienen nombres originales para no romper paquetes, rutas ni ejercicios existentes.
- Las clases nuevas utilizan `PascalCase`.
- Los métodos y variables utilizan `camelCase`.
- Los commits siguen una convención similar a Conventional Commits:

```text
<tipo>: <descripción corta>
```

Tipos habituales:

- `feat`: nuevo ejercicio o funcionalidad.
- `fix`: corrección de un error.
- `refactor`: reorganización interna sin cambiar el comportamiento.
- `docs`: cambios de documentación.

## Licencia

Este proyecto se distribuye bajo la licencia MIT. Consulta [`LICENSE`](LICENSE) para ver el texto completo.

## Autor

**Marcos García Lorenzo**
