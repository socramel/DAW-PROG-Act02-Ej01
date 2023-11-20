package base;

import java.util.Scanner;

/**
*@author Marcos Lema
*@version v1.0
*DNI: 47374401J
*Modulo: programacion DAW2324
*Email: marcos.lema@formacionchios.es
*Actividad: Actividad02-Ejercicio01
 */

public class EnteroAleatorio {

	public static void main(String[] args) {
		
		// Creamos el array para guardar los 100 números enteros aleatorios
		int [] numeros = new int[100];
		
		// Creamos el bucle for para generar 100 números entre 1 y 25
		for (int i = 0; i < 100; i++) {
			numeros[i] = (int)(Math.random()*25+1);
		}
		
		Scanner sc = new Scanner(System.in);
		
		int opcion;
				
		do {			
			System.out.println("========= Menú =========");
			System.out.println("1. Ver el mayor de los números");
			System.out.println("2. Obtener la suma de todos los números");
			System.out.println("3. Salir de la aplicación");
			System.out.println("========================");
			System.out.println("Ingrese su opción: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				int mayor = mayorNumero(numeros);
				System.out.println("\nEl mayor de los números es: " + mayor + "\n");
				break;
			case 2:
				int suma = obtenerSuma(numeros);
				System.out.println("\nLa suma de todos los números es: " + suma + "\n");
				break;
			case 3:
				System.out.println("\nSaliendo de la aplicación...");
				break;
			default:
				System.out.println("Opción incorrecta. Por favor, teclee una opción válida.");
				System.out.println("\n");
				break;
			}
		} while(opcion != 3);
		
		sc.close();
	}
	
	// Método para encontrar el número mayor en el array
	private static int mayorNumero(int[] array) {
		int mayor = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] > mayor) {
				mayor = array[i];
			}
		}
		return mayor;
	}
	
	// Método para calcular la suma de todos los números en el array
	private static int obtenerSuma(int[]array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	} 

}