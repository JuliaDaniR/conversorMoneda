# Conversor de Moneda

Este es un programa simple de Java para convertir monedas.

## Funcionalidades

- Conversión de una moneda base a una moneda de destino.
- Visualización de las monedas disponibles.
- Continuación del proceso de conversión o salida del programa.

## Requisitos

- Java Development Kit (JDK) instalado.
- Un entorno de desarrollo integrado (IDE) como Eclipse, IntelliJ IDEA o similar.
- Acceso a Internet para obtener las tasas de conversión actualizadas (a través de una API externa).

## Instrucciones de Uso

1. Clona o descarga este repositorio en tu máquina local.
2. Abre el proyecto en tu IDE.
3. Ejecuta la clase `Principal.java` para iniciar el programa.
4. Sigue las instrucciones en la consola para realizar conversiones de moneda.

## Estructura del Proyecto

- **src**: Contiene los archivos fuente del programa Java.
  - `Menu.java`: Clase que maneja la interfaz de usuario y las opciones del menú.
  - `Conversion.java`: Clase que realiza las conversiones de moneda.
  - `ConsultaApi.java`: Se realiza la consulta a la "Exchange Rate API".
  - `Moneda.java`: Clase que representa una moneda en el sistema de conversión de moneda.
                  Contiene atributos como el nombre de la moneda, su código ISO, y
                  métodos para obtener y establecer estos atributos, así como cualquier
                  funcionalidad relacionada con la moneda en el sistema.
  - `Principal.java`: Clase principal que inicia el programa.
- **resources**: Contiene recursos adicionales como archivos de configuración o datos.
- **docs**: Documentación adicional o archivos relacionados con el proyecto.


