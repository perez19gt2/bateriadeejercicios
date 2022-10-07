package Pagina_4;

import java.util.Scanner;

public class Tarea_28 {

	public static void main(String[] args) {
		//Diseñar un programa que, dados 10 números naturales, indique
		// cuántos de ellos son números pares, nos muestre estos y calcule la
	//	media aritmética de los impares.
		
		Scanner en = new Scanner(System.in);
		int c=0,cont=0,cont2=0,aux=0,media=0;
		System.out.println("Escriba el numero 0 para terminar");

		

		do {
			System.out.print("Ingrese el numero: ");
			c = en.nextInt();
			
			if(c % 2 == 0) {
				cont = cont + 1;
			}else {
				aux = aux + c;
				
				cont2 = cont2 + 1;
				
				media = (aux/cont2);
				
			}
		}while(c != 0);


					
//codigo mas kk el mio profe pero ni modo


		System.out.print("Los numeros pares son "+(cont-1) + "\n" );
		System.out.print("Los numeros impares son: "+cont2 + "\n");
		System.out.println("La suma de los numeros impares es: " + aux);
		System.out.println("La media es: " + media);
		
		
		en.close();

	}

}
