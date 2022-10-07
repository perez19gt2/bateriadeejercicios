package Pagina_4;

import java.util.Scanner;

public class Tarea_25 {

	public static void main(String[] args) {
		// Crear un programa que convierta de °C a °F o viceversa una
		// temperatura ingresada por el usuario. De antemano, se le debe
	//	preguntar al usuario de qué sistema a qué sistema desea convertir.
		
		
		Scanner in = new Scanner(System.in);

		byte op;
		double f,c;
		
		System.out.println("Que opcion elegira: ");
		System.out.println("1) Celcius a Fahrenheit \t 2) Fahrenheit a Celcius");
		op = in.nextByte();
		
		switch(op) {
		case 1:
			System.out.println("Convertir Celcius a Fahrenheit");
			System.out.println("Ingrese los grados en Celcius");
			c = in.nextDouble();
			
			f = (c*9/5)+32;
			
			System.out.print("Los grados en Celcius convertidos en Fahrenheit son: " + f);
			
			break;
		case 2:
			System.out.println("Convertir Fahrenheit a Celcius");
			System.out.println("Ingrese los grados en Fahrenheit");
			f = in.nextDouble();
			
			c = (f-32)*5/9;
			
			System.out.print("Los grados en Fahrenheit convertidos en Celcius son: " + c);
			
			break;
		
		}
		
in.close();
	}

}
