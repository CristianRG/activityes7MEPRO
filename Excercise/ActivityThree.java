/* Nombre: Rizo Gómez Cristian Alexander
   Grupo: DSM109
   Contenido: Programa capaz de calcular el promedio*/
package Excercise;

import java.util.Scanner;

public class ActivityThree {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Este programa permite calcular el promedio a base de tres calificaciones");
		System.out.println("Ingrese la primera calificación: ");
		int calificacionOne = input.nextInt();
		System.out.println("Ingrese la segunda calificación: ");
		int calificacionTwo = input.nextInt();
		System.out.println("Ingrese la tercera calificación: ");
		int calificacionThree = input.nextInt();
		
		int promedio = (calificacionOne+calificacionTwo+calificacionThree)/3; 
		
		if(promedio >= 9) {
			System.out.println("El promedio total es de: "+(promedio+0.5));
		}
		else {
			System.out.println("El promedio total es de: "+promedio);
		}
	}
}

