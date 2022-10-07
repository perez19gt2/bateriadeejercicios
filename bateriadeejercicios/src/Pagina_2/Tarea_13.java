package Pagina_2;

import java.util.Scanner;

public class Tarea_13 {

	public static void main(String[] args) {
		// Se pide representar el programa que nos calcule la suma de
		//los N primeros números pares. Es decir, si insertamos un 5, nos
		//haga la suma de 6+8+10+12+14.
		
		int num = 1, cont = 1, suma=0;
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Ingrese un  numero");
		num = in.nextInt();
		
		while(cont <= num) {
			if( num % 2 == 0) {
				suma = suma + num;
				cont = cont + 1;
			}
			num = num + 1;
		}
		
		System.out.println(num);
		
in.close();
	}

}
