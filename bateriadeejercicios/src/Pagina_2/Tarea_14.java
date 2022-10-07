package Pagina_2;

import java.util.Scanner;

public class Tarea_14 {

	public static void main(String[] args) {
		// .Dada una secuencia de números leídos por teclado, que acabe con
		//un –1, por ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,……,-1; Realizar el programa
		//que calcule la media aritmética. Suponemos que el usuario no
		//insertará número negativos.
		int  sumaDatos=0,dato=30,cont=0;
		
		Scanner in = new Scanner(System.in);

		System.out.println("--------------Calculadora de media aritmetica--------------");
		System.out.println("El numero 0 no puede ser ingresado");
			System.out.println("-1 para terminar el programa");
			System.out.println("---------------------------------------------");
			

			while(dato >= 1) {
				 cont++;
				System.out.print("Dato " + cont + ": ");
				dato = in.nextInt();
				sumaDatos = sumaDatos + dato;
				if(dato == -1) {
					int st = sumaDatos+1;
					System.out.println("La suma total de los datos es: " + st);
					int div = cont-1;
					System.out.print("el total de numeros ingresados es: " + div + "\n");
					System.out.println("La media es: " + (st/div));
					System.out.println("---------------------------------------");
					System.out.println("Fin del programa, pagueme profe!");
					break;
				}
			}

			//no cuestione mis metodos profe, cuestione mis resultados hahaha
			in.close();
			
	}

}
