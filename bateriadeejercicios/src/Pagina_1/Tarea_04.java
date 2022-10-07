package Pagina_1;

import java.util.Scanner;

public class Tarea_04 {

	public static void main(String[] args) {
		// Diseñar un programa que pida por teclado tres números; si el
		//primero es negativo, debe imprimir el producto de los tres y si no lo
		//es, imprimirá la suma.
		
		int num1,num2,num3;
		int aux = 0, result;

		Scanner en = new Scanner(System.in);
		
		
		System.out.println("Digite el primer numero: ");
		num1 = en.nextInt();
		System.out.println("Digite el primer numero: ");
		num2 = en.nextInt();
		System.out.println("Digite el primer numero: ");
		num3 = en.nextInt();
		
		
		if(num1 < aux) {
			System.out.println("Se procede a multiplicar: " + num1 +" x "+ num2 + " x " + num3);
			result = (num1*num2*num3);
			System.out.println("El resultado de la Multiplicacion es: " + result);
		}else {
			System.out.println("Se procede a Sumar: " + num1 +" + "+ num2 + " + " + num3);
			result = (num1+num2+num3);
			System.out.println("El resultado de la Suma es: " + result);
		}
		
		
		
		
		en.close();
	}

}
