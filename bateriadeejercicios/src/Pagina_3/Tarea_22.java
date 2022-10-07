package Pagina_3;

import java.util.Scanner;

public class Tarea_22 {

	public static void main(String[] args) {
		// Un año divisible por 4 es bisiesto y no debe ser divisible entre 100.
	//	• Si un año es divisible entre 100 y además es divisible entre 400,
		//también resulta bisiesto
		
		int anio;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el anio a evaluar: ");
		anio = entrada.nextInt();
		
		if( anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
			System.out.println("El anio: " + anio + " es bisiesto");
		}else {
			System.out.println("El anio: " + anio + " no es un anio bisiesto.");
		}
		
entrada.close();
	}

}
