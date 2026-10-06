# DAM

Repositorio personal de ejercicios, practicas, examenes y material de estudio relativo a las asignaturas de Programacion, Bases de Datos y Acceso a Datos, del ciclo formativo de **Desarrollo de Aplicaciones Multiplataforma (DAM)**.

El repositorio esta organizado principalmente por curso y asignatura. La mayoria de los ejercicios son independientes y conservan su estructura original para poder abrirlos y ejecutarlos desde IntelliJ IDEA.

## Indice

- [Estructura general](#estructura-general)
- [Contenido por curso](#contenido-por-curso)
- [Practicas principales](#practicas-principales)
- [Examenes y simulacros](#examenes-y-simulacros)
- [Ejercicios incompletos o en revision](#ejercicios-incompletos-o-en-revision)
- [Requisitos](#requisitos)
- [Compilar y ejecutar](#compilar-y-ejecutar)
- [Convenciones](#convenciones)

## Estructura general

```text
DAM/
├── src/
│   ├── Curso2425/
│   │   ├── BasesDeDatos/
│   │   └── Programacion/
│   ├── Curso2526/
│   │   ├── BasesDeDatos/
│   │   └── Programacion/
│   └── Curso2627/
│       └── AccesoADatos/
├── data/                 # Bases de datos H2 de ejemplo
├── pom.xml               # Configuracion Maven
├── README.md
└── LICENSE
```

Dentro de `src` tambien hay recursos asociados a los ejercicios, como PDFs, scripts SQL, ficheros de texto, CSV, DAT y ZIPs de entregas.

## Contenido por curso

### Curso 2024-2025

`src/Curso2425/`

- `Programacion/`: ejercicios y examenes de Java.
- `BasesDeDatos/`: ejercicios y examenes de SQL, PLSQL y MongoDB.
- Incluye material de convocatorias ordinarias y soluciones de ejercicios de bases de datos.

### Curso 2025-2026

`src/Curso2526/`

- `Programacion/`: ejercicios de Java organizados por bloques de aprendizaje (`A` a `N`), desde fundamentos y orientacion a objetos hasta ficheros, colecciones, lambdas y acceso a datos.
- `Programacion/ExamenesMGL/`: examenes, simulacros y practicas de evaluacion.
- `Programacion/HundirLaFlota/`: proyecto de consola con varias clases relacionadas.
- `Programacion/M/`: ejercicios de acceso a datos, DAO, H2 y una practica de pizzeria.
- `BasesDeDatos/SQL/`: ejercicios de SQL, tablas, consultas y vistas.
- `BasesDeDatos/MongoDB/`: colecciones, consultas y soluciones.
- `BasesDeDatos/UT08 PLSQL/`: procedimientos, funciones, cursores y triggers.

### Curso 2026-2027

`src/Curso2627/`

- `AccesoADatos/RA1/Ejercicio1/`: operaciones con ficheros y directorios.
- `AccesoADatos/RA6/Ejercicio1/`: gestion basica de clientes y productos.
- `AccesoADatos/RA6/Ejercicio2/`: gestion de clientes, productos y pedidos.
- `AccesoADatos/RA6/Ejercicio3/`: operaciones CRUD con clientes, productos, pedidos, oficinas y vendedores.

## Practicas principales

Estas son las practicas que tienen una estructura mas cercana a un proyecto completo:

| Practica | Ubicacion | Ejecucion |
|---|---|---|
| Hundir la flota | `src/Curso2526/Programacion/E/HundirLaFlota/` | Ejecutar `E` |
| DAO de personas | `src/Curso2526/Programacion/M/M1/` | Ejecutar `M` |
| DAO de coches | `src/Curso2526/Programacion/M/M2/` | Ejecutar `M` |
| Pizzeria con H2 | `src/Curso2526/Programacion/M/Pizzeria/` | Ejecutar la clase `Pizzeria` desde IntelliJ |
| Operaciones de texto | `src/Curso2627/AccesoADatos/RA1/Ejercicio1/` | Ejecutar `Curso2627.AccesoADatos.RA1.Ejercicio1.Main` |
| Clientes y productos | `src/Curso2627/AccesoADatos/RA6/Ejercicio1/` | Ejecutar `Curso2627.AccesoADatos.RA6.Ejercicio1.Main` |
| Pedidos | `src/Curso2627/AccesoADatos/RA6/Ejercicio2/` | Ejecutar `Curso2627.AccesoADatos.RA6.Ejercicio2.Main` |
| CRUD | `src/Curso2627/AccesoADatos/RA6/Ejercicio3/` | Ejecutar `Curso2627.AccesoADatos.RA6.Ejercicio3.Main` |

Los nombres completos de clase son orientativos para las practicas que tienen `main`. Los ejercicios pequenos pueden tener varias clases ejecutables o depender de ficheros situados en su propia carpeta; en esos casos es preferible abrir la clase desde IntelliJ y ejecutarla con su configuracion.

## Examenes y simulacros

Los examenes se conservan separados del resto de ejercicios para que sea facil localizarlos:

- `src/Examenes`
- `src/Curso2425/BasesDeDatos/Examenes/`
- `src/Curso2526/Programacion/ExamenesMGL/`
- `src/Curso2526/BasesDeDatos/ExamenesMGL/`

En estas carpetas puede haber enunciados, soluciones, recursos de entrada y entregas comprimidas. Los archivos ZIP representan entregas o copias de ejercicios y no son necesarios para compilar el proyecto principal.

## Ejercicios incompletos o en revision

El repositorio tambien contiene ejercicios empezados o pendientes de completar. Los mas claros actualmente son:

- `src/Curso2627/AccesoADatos/RA1/Ejercicio1/OPERACIONESTEXTOS.java`: contiene metodos declarados pero aun sin implementar, como la creacion de ficheros y directorios, la copia de ficheros y el filtrado de lineas.
- `src/Curso2627/AccesoADatos/RA6/Ejercicio3/OperacionesCRUD.java`: contiene operaciones CRUD pendientes o con resultados provisionales.
- `src/Curso2627/AccesoADatos/RA6/Ejercicio2/GestorDatos.java`: algunas busquedas devuelven `null` cuando no encuentran datos; debe comprobarse si es el comportamiento esperado del ejercicio.
- Las carpetas `Examenes`, `ExamenesMGL` y `Simulacro` deben considerarse material de evaluacion, no necesariamente proyectos terminados.

Esta lista es deliberadamente conservadora: que un metodo devuelva `null` no siempre significa que este incompleto, ya que puede ser parte del comportamiento solicitado por el ejercicio.

## Requisitos

- JDK 21.
- Maven.
- IntelliJ IDEA recomendado.
- Lombok, declarado como dependencia Maven para los ejercicios que lo utilizan.
- H2, declarado como dependencia Maven para las practicas que acceden a esa base de datos.

La configuracion principal esta en `pom.xml`. El proyecto utiliza `src` como directorio de codigo fuente para conservar la organizacion academica actual.

## Compilar y ejecutar

Desde la raiz del repositorio:

```bash
mvn -q compile
```

Para ejecutar una clase compilada:

```bash
java -cp target/classes Curso2627.AccesoADatos.RA1.Ejercicio1.Main
```

Tambien se puede ejecutar cualquier clase con `main` desde IntelliJ IDEA:

1. Importar el proyecto como proyecto Maven.
2. Seleccionar JDK 21.
3. Abrir la clase que contiene `main`.
4. Ejecutarla con **Run**.

Algunas practicas necesitan ficheros de entrada relativos a su carpeta. Si una ejecucion no encuentra un recurso, revisar el **Working directory** de la configuracion de IntelliJ y establecer la raiz del repositorio o la carpeta de la practica, segun la ruta utilizada por el ejercicio.

La carpeta `data/` contiene archivos H2 de ejemplo. No debe borrarse mientras se utilicen las practicas que se conectan a esa base de datos.

## Convenciones

- Los paquetes siguen la organizacion por curso, asignatura y ejercicio.
- Los ejercicios antiguos mantienen sus nombres originales para no romper paquetes ni rutas.
- Las clases nuevas deberian utilizar `PascalCase`.
- Los metodos y variables deberian utilizar `camelCase`.
- Los commits siguen una convencion similar a Conventional Commits:

```text
<tipo>: <descripcion corta>
```

Tipos habituales:

- `feat`: nuevo ejercicio o funcionalidad.
- `fix`: correccion de un error.
- `refactor`: reorganizacion interna sin cambiar el comportamiento.
- `docs`: cambios de documentacion.

## Licencia

Este proyecto se distribuye bajo la licencia MIT. Consulta `LICENSE` para ver el texto completo.

## Autor

**Marcos Garcia Lorenzo**