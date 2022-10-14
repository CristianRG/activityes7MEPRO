/* Nombre: Rizo Gómez Cristian Alexander
   Grupo: DSM109
   Contenido: Programa capaz de identificar si eres mayor o menor de edad*/
package Excercise;

import java.util.Scanner;

public class activityFour {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Este programa permite verificar si es mayor de edad");
		System.out.println("Ingrese la edad: ");
		int edad = input.nextInt();
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad, con una edad de: "+edad);
		}else {
			System.out.println("Eres menor de edad, con una edad de: "+edad);
		}
	}
}
