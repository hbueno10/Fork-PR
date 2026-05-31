# 🕐 Sistema de Despertador Inteligente

## 📋 Descripción del Proyecto

Sistema de lógica interna para un despertador inteligente similar al de smartphones modernos, desarrollado en Java sin interfaz gráfica. El objetivo es implementar una aplicación robusta, modular y escalable que gestione múltiples alarmas con funcionalidades avanzadas.

## 🎯 Objetivos

- Implementar una lógica de alarmas inteligente y desacoplada
- Gestionar múltiples alarmas con patrones de repetición semanal complejos
- Incluir funcionalidades avanzadas como modo circadiano, estadísticas de sueño y detección de conflictos
- Demostrar buenas prácticas de diseño orientado a objetos
- Aplicar principios SOLID en la arquitectura del sistema
- Documentar técnicamente el proyecto de forma profesional

## 💻 Tecnologías Utilizadas

- **Lenguaje**: Java 11+
- **Control de Versiones**: Git y GitHub
- **Documentación**: Markdown, Mermaid (diagramas UML)
- **Herramientas de IA**: ChatGPT, Claude (asistencia en análisis y documentación)
- **Testing**: JUnit 5 (opcional)

## 📁 Estructura del Proyecto

```
Fork-PR/
├── src/
│   ├── main/java/smartalarm/
│   │   ├── model/
│   │   │   ├── Alarm.java
│   │   │   ├── AlarmManager.java
│   │   │   ├── SoundProfile.java
│   │   │   ├── SnoozeManager.java
│   │   │   ├── Scheduler.java
│   │   │   ├── UserPreferences.java
│   │   │   ├── SleepStatistics.java
│   │   │   ├── CircadianMode.java
│   │   │   └── WeeklyRepetition.java
│   │   ├── enums/
│   │   │   ├── AlarmStatus.java
│   │   │   ├── DayOfWeek.java
│   │   │   └── SoundType.java
│   │   └── Main.java
│   └── test/java/ (en desarrollo)
├── docs/
│   ├── DESIGN.md (Análisis y Diseño)
│   ├── USE_CASES.md (Especificación de casos de uso)
│   ├── CLASS_DIAGRAM.md (Diagrama UML de clases)
│   ├── USE_CASE_DIAGRAM.md (Diagrama UML de casos de uso)
│   ├── AI_REFLECTION.md (Reflexión sobre IA)
│   └── TECHNICAL_REFLECTION.md (Reflexión técnica)
├── README.md (este archivo)
└── .gitignore
```

## 🚀 Instalación y Ejecución

### Requisitos Previos
- Java 11 o superior instalado
- Git instalado
- IDE recomendado: IntelliJ IDEA o Eclipse

### Clonar el Repositorio
```bash
git clone https://github.com/hbueno10/Fork-PR.git
cd Fork-PR
git checkout develop
```

### Compilar el Proyecto
```bash
javac -d bin src/main/java/smartalarm/**/*.java
```

### Ejecutar la Aplicación
```bash
java -cp bin smartalarm.Main
```

## 📊 Funcionalidades Principales

### Obligatorias
- ✅ Crear, eliminar, activar/desactivar alarmas
- ✅ Configurar hora, minuto y nombre de alarma
- ✅ Repetición semanal (días específicos, días de semana, fines de semana)
- ✅ Configurar sonido personalizado y volumen
- ✅ Posponer alarma (Snooze)
- ✅ Detener alarma
- ✅ Consultar próximas alarmas activas

### Funcionalidades Avanzadas (3+ implementadas)
1. **🌅 Modo Circadiano**: Activación progresiva con aumento de brillo y volumen
2. **📊 Perfil de Sueño**: Registro de estadísticas (horas dormidas, veces pospuestas, puntualidad)
3. **⚠️ Detección de Conflictos**: Identifica alarmas muy cercanas (< 5 minutos)
4. **🏷️ Alarmas por Categorías**: trabajo, estudio, deporte, medicina, personal
5. **🧮 Retos Matemáticos**: La alarma requiere resolver un problema para apagarse

## 🏗️ Diseño Orientado a Objetos

El sistema sigue una arquitectura modular basada en responsabilidades claras:

- **Model**: Entidades principales del negocio
- **Enums**: Tipos constantes del sistema
- **Manager**: Gestor central de alarmas
- **Scheduler**: Planificador de activaciones

### Principios SOLID Aplicados
- **S**ingle Responsibility: Cada clase tiene una única responsabilidad
- **O**pen/Closed: Extensible sin modificar código existente
- **L**iskov Substitution: Interfaces bien definidas
- **I**nterface Segregation: Interfaces específicas
- **D**ependency Inversion: Dependencias inyectadas

## 📖 Documentación Técnica

Consulta los documentos en `/docs/`:
- **DESIGN.md**: Análisis detallado del diseño
- **USE_CASES.md**: Especificación completa de casos de uso
- **CLASS_DIAGRAM.md**: Explicación del diagrama UML de clases
- **USE_CASE_DIAGRAM.md**: Análisis del diagrama de casos de uso
- **TECHNICAL_REFLECTION.md**: Decisiones de diseño y problemas resueltos
- **AI_REFLECTION.md**: Reflexión crítica sobre el uso de IA

## 🔄 Flujo de Trabajo Git

Este proyecto sigue GitFlow:

```
main (versión estable)
  ↑
develop (rama de desarrollo)
  ↑
feature/* (ramas de funcionalidad)
```

### Convención de Commits
```
feat: añadir nueva funcionalidad
fix: corregir error
docs: actualizar documentación
refactor: mejora de código sin cambios funcionales
test: añadir pruebas
chore: cambios administrativos
```

## 📝 Requisitos de Código

El código sigue estos estándares:
- Nombres descriptivos y significativos
- Encapsulación: atributos privados, métodos públicos donde sea necesario
- Sin duplicidad de código
- Comentarios solo en lógica compleja
- Máximo 100 líneas por método
- Máximo 30 líneas por clase pequeña

## 👤 Autor

**[Tu Nombre]** - Estudiante de desarrollo de software

## 📅 Fechas Relevantes

- **Inicio**: [Fecha inicio]
- **Entrega**: Lunes, 1 de junio de 2026, 23:59
- **Estado**: En desarrollo 🚀

## 📞 Soporte

Para dudas sobre el código, consulta:
1. Los documentos en `/docs/`
2. Los comentarios en el código fuente
3. Los ejemplos en `Main.java`

---

**Última actualización**: 31 de mayo de 2026
