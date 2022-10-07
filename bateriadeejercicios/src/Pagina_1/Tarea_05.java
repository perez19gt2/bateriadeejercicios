package Pagina_1;

import java.util.Scanner;

public class Tarea_05 {

	public static void main(String[] args) {
		// Realizar un programa que lea un número por teclado. En caso de que
		//ese número sea 0 o menor que 0, se saldrá del programa
		//imprimiendo antes un mensaje de error. Si es mayor que 0, se deberá
		//calcular su cuadrado y la raíz cuadrada del mismo, visualizando el
		//número que ha tecleado el usuario y su resultado (“Del número X, su
		//potencia es X y su raíz X”).
		
		int numero;
		double cuadrado, raiz;
		
		Scanner en = new Scanner(System.in);
		
		System.out.print("Digite un numero: ");
		numero = en.nextInt();
		
		while(numero == 0 || numero < 0) {
			
			System.out.println("ERROR");
		break;
	}
		
		if(numero > 0) {
			cuadrado = Math.pow(numero, 2);
			raiz = Math.sqrt(numero);
			System.out.println("El numero ingresado es: " + numero);
			System.out.println("El numero " + numero + " elevado al cuadrado es: " + cuadrado);
			System.out.println("El numero " + numero + " tiene la raiz de: " + raiz);
		}
		

		
		en.close();

	}

}
