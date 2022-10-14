/* Nombre: Rizo Gómez Cristian Alexander
   Grupo: DSM109
   Contenido: Programa capaz de comparar dos números ingresados por el usuario*/

package Excercise;

import java.util.Scanner;

public class ActivityOne {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); /* Instanciamos una nueva clase, llamada Scanner para
		 										que pueda ser llamada desde el nuevo objeto "input"; ahora
		 										puede acceder a sus atributos */
		 
		 System.out.println("Ingrese dos números para comparar y determinar el mayor");
		 
		 System.out.println("Ingrese el primer número: ");
		 int numerOne = input.nextInt();
		 System.out.println("Ingrese el segundo número: ");
		 int numerTwo = input.nextInt();
		 
		 if (numerOne > numerTwo) {
			 System.out.println("El mayor es el número: "+numerOne);
		 }else {
			 System.out.println("El mayor es el número: "+numerTwo);
		 }
	 }
}
