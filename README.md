# Proyecto de Alarmas Java

Este proyecto implementa un gestor de alarmas en Java con funcionalidades básicas de programación, repetición por días de la semana, perfiles de sonido y modo vacaciones.

## Características

- Crear alarmas con hora, etiqueta, días de repetición, categoría y perfil de sonido.
- Mostrar próximas alarmas activas ordenadas por hora.
- Activar y desactivar el modo vacaciones, que desactiva todas las alarmas.
- Comprobar si una alarma debe sonar en un momento dado.
- Soporte de perfil de sonido con modo circadiano para ajuste de volumen gradual.
- Estadísticas simples de posponer y despertar.

## Archivos del proyecto

- `Main.java` - Clase principal que crea instancias y simula el comportamiento de las alarmas.
- `Alarm.java` - Modelo de alarma con hora, estado, repetición y estadísticas.
- `AlarmManager.java` - Gestor de alarmas, creación, eliminación, comprobación y modo vacaciones.
- `AlarmCategory.java` - Enumeración de categorías de alarma.
- `SoundProfile.java` - Perfil de sonido con tipo de tono y volumen base.
- `CircadianMode.java` - Ajusta el volumen en función del tiempo para un efecto circadiano.
- `SleepStatistics.java` - Registra posponer y despertares.
- `UserPreferences.java` - Preferencias de usuario, incluyendo el modo vacaciones.

## Requisitos

- Java 17 o superior.

## Uso

1. Abrir la carpeta del proyecto en tu IDE o terminal.
2. Compilar las clases:
   ```bash
   javac *.java
   ```
3. Ejecutar la aplicación:
   ```bash
   java Main
   ```

## Ejemplo de comportamiento

- `Main` crea una alarma de ejemplo para los lunes, martes y miércoles a las 07:00.
- Muestra las próximas alarmas activas.
- Simula la comprobación de alarma en una fecha y hora específicas.

## Notas

- El proyecto está montado como una aplicación de consola sencilla.
- No incluye persistencia; las alarmas solo existen durante la ejecución.
- Se puede ampliar con interfaz gráfica, almacenamiento en archivos/BD y más tipos de notificaciones.
