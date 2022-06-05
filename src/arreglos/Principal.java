package arreglos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int[] numeros = new int[] {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40};
		///////////////////////////0,1,2,3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18,19,
		
		System.out.println("Ingrese numero a buscar");
		int busqueda = 0;
		
		while(true) {
		try {
		busqueda = sc.nextInt();
		break;
		}catch(InputMismatchException exeption) {
			System.out.println("Caracteres invalidos, ingrese un numero entero");
			sc.nextLine();
		}
		}
		
		int minimo = 0;
		int medio;
		int maximo = numeros.length - 1;		
		boolean encontrado = false;
		
		while(minimo <= maximo) {
			medio = (minimo + maximo )/2;
			
			if(numeros[medio]==busqueda) {
				
				System.out.println("El numero buscado esta en la posicion: "+medio);
				encontrado = true;
				break;
				
			}else if(busqueda < numeros[medio]) {
				maximo = medio - 1;
			} else {
				minimo = medio + 1;
			}
			 					
		}
		if (!encontrado) {
		System.out.println("El numero buscado no se encuentra en el arreglo");
		}

	}

}
