# Sistema de Gestión Académica Automatizada

Proyecto académico desarrollado para implementar automatización de pruebas y pipelines CI/CD utilizando Maven, JUnit 5, Jenkins y GitFlow.

---

# Descripción del Proyecto

El proyecto tiene como objetivo demostrar la implementación de buenas prácticas DevOps y automatización de pruebas aplicadas al desarrollo de software.

La solución incorpora:

- Control de versiones mediante Git y GitHub.
- Estrategia GitFlow para administración de ramas.
- Automatización de compilación con Maven.
- Pruebas unitarias automatizadas con JUnit 5.
- Pipeline de integración continua (CI).
- Deployment pipeline con pruebas de aceptación.
- Estrategia de rollback documentada.

---

# Objetivos del Proyecto

- Automatizar procesos de compilación y pruebas.
- Implementar integración continua mediante Jenkins.
- Validar pruebas automatizadas durante el pipeline CI/CD.
- Gestionar despliegues controlados mediante GitFlow.
- Implementar mecanismos de rollback para recuperación ante fallos.

---

# Tecnologías Utilizadas

| Tecnología         | Descripción                           |
| ------------------ | ------------------------------------- |
| Java 17            | Lenguaje de programación principal    |
| Maven              | Gestión de dependencias y compilación |
| JUnit 5            | Framework de pruebas unitarias        |
| Selenium WebDriver | Automatización de pruebas funcionales |
| Jenkins            | Integración continua y despliegue     |
| Git                | Control de versiones                  |
| GitHub             | Repositorio remoto                    |
| GitFlow            | Estrategia de ramas                   |

---

# Estrategia GitFlow

El proyecto utiliza GitFlow para organizar el desarrollo y despliegue del software.

## Ramas utilizadas

| Rama                        | Función                                |
| --------------------------- | -------------------------------------- |
| main                        | Versión estable del proyecto           |
| develop                     | Rama principal de integración          |
| feature/pruebas-unitarias   | Desarrollo de pruebas automatizadas    |
| feature/pipeline-ci         | Configuración del pipeline CI          |
| feature/deployment-pipeline | Configuración de despliegue y rollback |

---

# Estructura del Proyecto

```plaintext
sistema-gestion-academica/
│
├── src/
│   ├── main/
│   │   └── java/com/proyecto/app/
│   │
│   └── test/
│       └── java/com/proyecto/app/
│
├── Jenkinsfile
├── pom.xml
├── ROLLBACK.md
├── README.md
└── .gitignore
```

---

# Configuración Maven

El proyecto utiliza Maven para:

- Gestión de dependencias.
- Compilación automatizada.
- Ejecución de pruebas.
- Integración con Jenkins.

## Dependencias Implementadas

- JUnit 5
- Selenium WebDriver
- WebDriverManager

---

# Ejecución del Proyecto

## Compilar el proyecto

```bash
mvn clean compile
```

## Ejecutar pruebas unitarias

```bash
mvn test
```

## Ejecutar validación completa

```bash
mvn verify
```

---

# Pruebas Automatizadas

El proyecto incorpora pruebas automatizadas utilizando JUnit 5 para validar la lógica de negocio del sistema académico.

## Casos implementados

- Validación de asistencia aprobada.
- Validación de asistencia reprobada.

---

# Pipeline CI/CD

El archivo `Jenkinsfile` implementa un pipeline CI/CD utilizando Jenkins Declarative Pipeline.

## Stages implementados

1. Checkout
2. Build
3. Unit Tests
4. Integration Tests
5. Acceptance Tests
6. Deploy to Staging
7. Rollback Validation

---

# Deployment Pipeline

El deployment pipeline incorpora automatización de despliegue hacia un ambiente de pruebas (staging), permitiendo validar la estabilidad del sistema antes de una liberación definitiva.

---

# Estrategia de Rollback

El proyecto implementa una estrategia de rollback documentada en:

```plaintext
ROLLBACK.md
```

## Objetivo del rollback

Permitir la recuperación rápida de una versión estable del sistema ante errores detectados durante despliegues o pruebas de aceptación.

## Flujo de rollback

1. Ejecución de pruebas automatizadas.
2. Despliegue en ambiente staging.
3. Validación de acceptance tests.
4. Detección de errores.
5. Restauración de versión estable.

---

# Buenas Prácticas Implementadas

- Uso de GitFlow.
- Commits incrementales.
- Separación de ambientes mediante ramas.
- Exclusión de archivos temporales mediante `.gitignore`.
- Automatización de pruebas.
- Integración continua.
- Validación automatizada de despliegues.

---

# Evidencias Generadas

Durante el desarrollo del proyecto se generaron evidencias de:

- Creación de ramas GitFlow.
- Configuración Maven.
- Ejecución de pruebas automatizadas.
- Build Success.
- Pull Requests.
- Integración CI/CD.
- Deployment pipeline.
- Estrategia de rollback.

---

# Autor

**Cristian Pino**

Examen Final – Automatización de Pruebas
