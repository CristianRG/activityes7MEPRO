/* Nombre: Rizo Gómez Cristian Alexander
   Grupo: DSM109
   Contenido: Programa capaz de comparar dos números ingresados por el usuario*/
package Excercise;

import java.util.Scanner;

public class ActivityTwo {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Este programa permite comparar si es un número mayor, menor o igual al otro");
		System.out.println("Ingrese el primer número: ");
		int numerOne = input.nextInt();
		System.out.println("Ingrese el segundo número: ");
		int numerTwo = input.nextInt();
		
		if(numerOne < numerTwo) {
			System.out.println("El mayor es: "+numerTwo);
		}
		if(numerOne == numerTwo) {
			System.out.println("Ambos son iguales");
		}
		else {
			System.out.println("El mayor es: "+numerOne);
		}
		
	}
}
