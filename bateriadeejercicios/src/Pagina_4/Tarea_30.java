package Pagina_4;

import java.util.Scanner;

public class Tarea_30 {

	public static void main(String[] args) {
		// Realizar un programa que cree un arreglo de 10 enteros cuyos
		//valores son introducidos por el usuario. También debe pedir un valor
	//	que se deberá buscar en el arreglo. El programa debe decir en cuál
	//	posición se encuentra el valor que queríamos buscar.

		
		Scanner en = new Scanner(System.in);
		
		int Ar [] = new int [10];
		int num;
 		
		System.out.println("Digite los elementos");
		for (int i = 0; i < Ar.length; i++) {
			System.out.print("elemento ["+(i+1)+"] ");
			Ar[i] = en.nextInt();
		}
		System.out.println("Los elementos son: ");
		
		for (int i = 0; i < Ar.length; i++) {
			System.out.println(Ar[i]);
		}
		System.out.println("_________________________________");
		System.out.print("Digite el numero que desea buscar: ");
		num = en.nextInt();
		int i=0;
		while(i<10 && Ar[i] < num) {
			i++;
		}
		
		if(i==10) {
			System.out.println("El numero: " + num + " no fue encontrado.");
		}else {
			if(Ar[i] == num) {
				System.out.println("El numero fue encontrado en la Posicion: " + i);
			}else {
				System.out.println("\n el numero no fue encontrado");
			}
		}
		
	}

}
