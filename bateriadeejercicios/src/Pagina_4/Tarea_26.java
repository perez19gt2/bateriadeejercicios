package Pagina_4;

import java.util.Scanner;

public class Tarea_26 {

	public static void main(String[] args) {
		// Un programa que calcule el producto de N números ingresados por
	//	el usuario
		
		Scanner in = new Scanner(System.in);
		
		int x=1,r=1,p=0;
		
		while(x != 0) {
			System.out.print("Ingrese un numero: (0 para terminar)");
			x = in.nextInt();
			
			if(x != 0) {
				r = r*x;
				p = r;
			}
			
		}
		System.out.println("El producto de los numeros es: " + p);
		
		
		
		
		in.close();

	}

}
