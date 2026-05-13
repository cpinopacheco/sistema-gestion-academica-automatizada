# Estrategia de Rollback

## Objetivo

El mecanismo de rollback permite restaurar una versión estable de la aplicación en caso de errores durante el despliegue o fallas detectadas en producción.

## Estrategia Implementada

El pipeline CI/CD incorpora una validación de rollback mediante el stage:

- Rollback Validation

En caso de fallo durante el despliegue o pruebas de aceptación, el sistema puede revertir la versión actual utilizando la última versión estable almacenada en el repositorio.

## Flujo de Rollback

1. Ejecución de pruebas automatizadas.
2. Despliegue en ambiente de pruebas (staging).
3. Validación de acceptance tests.
4. Detección de errores.
5. Restauración de la última versión estable.

## Beneficios

- Reducción de tiempo de recuperación.
- Mayor estabilidad del sistema.
- Minimización del impacto ante fallas.
- Automatización del proceso de recuperación.

## Integración con Jenkins Pipeline

El rollback se encuentra integrado dentro del pipeline CI/CD mediante validaciones automáticas posteriores al despliegue.
