# Ejercicio de Estacionamiento 🚗🅿️

Este proyecto es un programa en Java que simula la facturación de un estacionamiento. El usuario debe ingresar la patente del vehículo y seleccionar el tipo de estacionamiento que desea pagar. Existen tres tipos de estacionamiento con diferentes tarifas y descuentos aplicados.

## Características 📋

- **Tarifas**:
  - **Por Hora**: 3 USD por hora.
  - **Media Jornada**: 15 USD con un 5% de descuento.
  - **Jornada Completa**: 30 USD con un 10% de descuento.
  
- **Descuentos**:
  - Media jornada tiene un **5% de descuento**.
  - Jornada completa tiene un **10% de descuento**.

- El programa continúa solicitando datos de vehículos hasta que se ingrese la palabra **"FIN"** en lugar de la patente.

## Instrucciones de uso 🚀

1. Al iniciar el programa, se solicitará la **patente** del vehículo.
2. Luego, se pide seleccionar el tipo de estacionamiento:
   - Opción `1` para estacionamiento por **hora**.
   - Opción `2` para **media jornada**.
   - Opción `3` para **jornada completa**.
3. Si se selecciona la opción por hora, se pedirá la cantidad de horas que se desea abonar.
4. El sistema calculará el monto total a pagar y lo mostrará en pantalla.
5. El proceso se repite hasta que el usuario ingrese **"FIN"** en la patente.

## Ejemplo de ejecución 💻

```bash
Ingresar la patente del vehiculo:
ABC123
Ingrese el tipo de estacionamiento
1 - Por Hora            $  3 USD/hora
2 - Media Jornada       $ 15 USD
3 - Jornada Completa    $ 30 USD
1
Ingrese la cantidad de horas que desea pagar:
5
Usted deberá pagar $15.0 USD por 5 hs.

Ingresar la patente del vehiculo:
FIN
```
