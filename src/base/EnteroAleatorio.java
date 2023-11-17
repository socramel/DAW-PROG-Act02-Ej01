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
	/**
	 * @param args
	 * Metodo para arrancar la aplicacion
	 */

	public static void main(String[] args) {
		
		// Creamos el array para guardar los 100 números enteros aleatorios
		int [] numeros = new int[100];
		
		// Creamos el bucle for para generar 100 números entre 1 y 25
		for (int i = 0; i < 100; i++) {
			numeros[i] = (int)(Math.random()*25+1);
		}
		
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		mostrarMenu();
		
		do {			
			System.out.println("Ingrese su opción: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				int mayor = mayorNumero(numeros);
				System.out.println("El mayor de los números es: " + mayor);
				break;
			case 2:
				int suma = obtenerSuma(numeros);
				System.out.println("La suma de todos los números es: " + suma);
				break;
			case 3:
				System.out.println("Saliendo de la aplicación...");
				break;
			default:
				System.out.println("Opción incorrecta. Por favor, teclee una opción válida.");
				break;
			}
			if(opcion != 3) {
				System.out.println("¿Desea realizar otra acción? (1. Sí, 2. No): ");
				int continuar = sc.nextInt();
				if (continuar == 2) {
					opcion = 3;
					System.out.println("Saliendo de la aplicación...");
				}
					}
		} while(opcion != 3);
		
		sc.close();
		
		// System.out.println("El número entero aleatorio entre 1 y 25 es: " + numeros);
	}
	
	// Mostrar menú
	private static void mostrarMenu() {
		
	
	System.out.println("Menú: ");
	System.out.println("1. Ver el mayor de los números");
	System.out.println("2. Obtener la suma de todos los números");
	System.out.println("3. Salir de la aplicación");
	}
	
	// Función para encontrar el número mayor en el array
	private static int mayorNumero(int[] array) {
		int mayor = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] > mayor) {
				mayor = array[i];
			}
		}
		return mayor;
	}
	// Función para calcular la suma de todos los números en el array
	private static int obtenerSuma(int[]array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}
		return suma;
	}

}

