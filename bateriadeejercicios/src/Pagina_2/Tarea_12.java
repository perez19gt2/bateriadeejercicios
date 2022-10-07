package Pagina_2;

import java.util.Scanner;

public class Tarea_12 {

	public static void main(String[] args) {
		// Se pide representar el programa que nos calcule la suma de
	//	los N primeros números naturales. N se leerá por teclado.

		int num = 0, cont=0, totalSuma=0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese los N numeros que desea sumar");
		num = in.nextInt();
		
	while(num > 0) {

	 
	for (int i = 1; i <= num; i++) {
		System.out.print("No. " + i + " -- ");
		cont = in.nextInt();
		totalSuma = totalSuma+cont;
	}
break;
	}
	System.out.println("La suma de los numeros ingresados es: "+totalSuma);

		
		
		
		in.close();
	}

}
