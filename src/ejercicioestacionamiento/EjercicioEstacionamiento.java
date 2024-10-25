//  El programa debe debe solicitar por teclado dos datos
//  --> La Patente del vehiculo
//  --> El tipo de estacionamiento
//  |-> Por Hora - 3USD la hora
//  |-> Media Jornada - 15 USD con 5% de descuento
//  |-> Jornada Completa - 30 USD con 10% de descuento
//  El programa debe calcular el monto a pagar para cada cliente en función del tipo de estacionamiento seleccionado.
//  La carga de datos debe continuar hasta que el usuario ingrese la palabra "FIN" en lugar de la patente
package ejercicioestacionamiento;

import java.util.Scanner;

public class EjercicioEstacionamiento {

    public static void main(String[] args) {
        String patente = "";
        Scanner teclado = new Scanner(System.in);
        double precioPorTipo = 0, cantidadDeHoras, totalFactura, totalDia = 0;
        int tipoDeEstacionamiento, cont1 = 0, cont2 = 0, cont3 = 0;

        while (!patente.equalsIgnoreCase("fin")) {
            System.out.println("Ingresar la patente del vehículo (o 'FIN' para salir):");
            patente = teclado.nextLine();

            if (patente.equalsIgnoreCase("fin")) {
                System.out.println("Programa finalizado.");
                break; // Sale del bucle si se ingresa "FIN"
            }

            // Menú de opciones
            System.out.println("Ingrese el tipo de estacionamiento");
            System.out.println("1 - Por Hora            $  3 USD/hora");
            System.out.println("2 - Media Jornada       $ 15 USD con 5% de descuento");
            System.out.println("3 - Jornada Completa    $ 30 USD con 10% de descuento");

            tipoDeEstacionamiento = teclado.nextInt();

            // Validar que la opción sea válida
            if (tipoDeEstacionamiento < 1 || tipoDeEstacionamiento > 3) {
                System.out.println("Tipo de estacionamiento inválido. Intente nuevamente.");
                teclado.nextLine(); // Limpiar el buffer
                continue;
            }

            switch (tipoDeEstacionamiento) {
                case 1:
                    precioPorTipo = 3;
                    System.out.println("Ingrese la cantidad de horas que desea pagar:");
                    cantidadDeHoras = teclado.nextDouble();
                    totalFactura = precioPorTipo * cantidadDeHoras;
                    System.out.println("Usted deberá pagar $" + totalFactura + " USD por " + cantidadDeHoras + " horas.");
                    cont1++;
                    totalDia = totalDia + totalFactura;
                    break;
                case 2:
                    precioPorTipo = 15;
                    totalFactura = precioPorTipo * 0.95; // Aplicar descuento del 5%
                    System.out.println("Usted deberá pagar $" + totalFactura + " USD por media jornada con el descuento aplicado.");
                    cont2++;
                    totalDia = totalDia + totalFactura;
                    break;
                case 3:
                    precioPorTipo = 30;
                    totalFactura = precioPorTipo * 0.90; // Aplicar descuento del 10%
                    System.out.println("Usted deberá pagar $" + totalFactura + " USD por jornada completa con el descuento aplicado.");
                    cont3++;
                    totalDia = totalDia + totalFactura;
                    break;
            }

            teclado.nextLine(); // Limpiar el buffer antes de la próxima entrada
        }
        System.out.println("El total de servicios fueron: " + (cont1 + cont2 + cont3));
        System.out.println(cont1 + " de servicios por hora");
        System.out.println(cont2 + " de servicios de Media Jornada");
        System.out.println(cont3 + " de servicios de Jornada Completa");
        System.out.println("La recaudación total del día fue: " + totalDia + " USD");
    }
}
