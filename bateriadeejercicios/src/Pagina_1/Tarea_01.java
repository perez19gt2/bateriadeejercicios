package Pagina_1;

import java.util.Scanner;

public class Tarea_01 {
  public static void main(String args[]) {
	  
		// Dadas dos variables numéricas A y B, que el usuario debe teclear, se
		//pide realizar un programa que intercambie los valores de
		//ambas variables y muestre cuánto valen al final las dos variables.

		
		//Gueno, vamo a darle
		// en int por que? bueno porque asi quise hahaha
		
		int A = 0, B = 0, auxi;
		
		Scanner en = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de A");
		A = en.nextInt();

		System.out.println("Ingrese el valor de B");
		B = en.nextInt();
		System.out.println("****************************************");
		System.out.println("VALOR DE A ORIGINAL "+ A);
		System.out.println("VALOR DE A ORIGINAL "+ B);
		
		System.out.println("*************INTERCAMBIADOS*************");
		//CODIGAZIO SUPER SEGURO HAHA
		
		auxi =  A;
		A = B;
		B = auxi;
		
		System.out.println("El valor de A es: " + A);
		System.out.println("El valor de B es: " + B);
		
		System.out.println("****************************************");
		
		
		
		en.close();
  }
}
