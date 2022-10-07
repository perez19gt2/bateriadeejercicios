package Pagina_3;

import java.util.Scanner;

public class Tarea_20 {

	public static void main(String[] args) {

		// .Programa que lea un número entero (lado) y a partir de él, cree un
		// cuadrado de asteriscos con ese tamaño
		
		int c = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el tamaño del cuadro ");
		 c = entrada.nextInt();

		 if(c >= 0 && c <= 60) {
			 for (int i = 0; i < c; i++) {
				System.out.print("*");
			}
			 System.out.println("");
			 
			 
			 for(int i = 0; i < c-2; i++) {
				 System.out.print("*");
				 for (int j = 0; j < c-2; j++) {
					System.out.print("*");
				}
				 System.out.println("*");
			 }
			 
			 for (int i = 0; i < c; i++) {
				System.out.print("*");
			}
		 }
		 
		 

entrada.close();

	}

}
