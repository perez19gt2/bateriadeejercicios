package Pagina_1;

import java.util.Scanner;

public class Tarea_06 {

	public static void main(String[] args) {
		// Un colegio desea saber qué porcentaje de niños y qué porcentaje de
		//niñas hay en el curso actual. Diseñar un programa para este
		//propósito.
		

		Scanner en = new Scanner(System.in);

		System.out.print("Digite la cantidad total de alumnos ");
		int alumnos = en.nextInt();
		System.out.print("Digite la cantidad de varones: ");
		int varones = en.nextInt();
		System.out.print("Digite la cantidad de mujeres: ");
		int mujeres = en.nextInt();
		
		double PM = mujeres*100/alumnos;
		double PH = varones*100/alumnos;
		
		double val = varones + mujeres;
		
		if(val == alumnos) {
			System.out.println("***************************************");
			System.out.println("El porcentje de mujeres es: " + PM + "%");
			System.out.println("El porcentje de Varones es: " + PH + "%");
		}else {
			System.out.println("El total de datos ingresados no coinciden con el total de alumnos");
		}
		System.out.println("Fin del programa");

		

		en.close();
	}

}
