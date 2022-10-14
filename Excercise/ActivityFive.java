/* Nombre: Rizo Gómez Cristian Alexander
   Grupo: DSM109
   Contenido: Programa capaz de identificar si eres mayor o menor de edad*/
package Excercise;

import java.util.Scanner;

public class ActivityFive {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Este programa permite calcular el sueldo total");
		System.out.println("Ingresa el total de horas trabajadas: ");
		int horasTrabajadas = input.nextInt();
		System.out.println("Ingresa el pago por hora: ");
		int pagoHora = input.nextInt();
		int totalPagar = horasTrabajadas*pagoHora;
		
		if(totalPagar <= 1500) {
			System.out.println("El pago total es de: "+(totalPagar+500));
		}else {
			System.out.println("El pago total es de: "+(totalPagar+300));
		}
	}
}
