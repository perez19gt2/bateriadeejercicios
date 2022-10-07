package Pagina_1;

import java.util.Scanner;

public class Tarea_08 {

	public static void main(String[] args) {
		// Realizar un programa que, dado un número entero, visualice en
		//pantalla si es par o impar. En el caso de ser 0, debe visualizar “el
		//número no es par ni impar”.
		
		int num;
		Scanner en = new Scanner(System.in);
		//  que pereza
		
		System.out.println("Ingrese el numero");
		num = en.nextInt();
		
		//evaluemos profe
		
		if(num == 0) {
			System.out.println(num + " No es un numero par ni impar");
		}else if(num % 2 == 0){
System.out.println(num + " Es un numero par");
		}else {
			System.out.println(num + " No es un numero par");
		}

		en.close();
		
	}

}
