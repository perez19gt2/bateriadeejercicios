package Pagina_1;

import java.util.Scanner;

public class Tarea_09 {

	public static void main(String[] args) {
		// Modificar el programa anterior, de forma que, si se teclea un cero, se
		//vuelva a pedir el número por teclado (así hasta que se teclee un
			//	número mayor que cero).
		
		int num;
		Scanner en = new Scanner(System.in);
		//  que pereza
		

		
		//Primero validamos que el user no ingrese un numero 0 o un numero negativo
		
do {
	System.out.println("Ingrese el numero mayor a 0");
	num = en.nextInt();
	
}while(num <= 0);

if(num % 2 == 0){
	System.out.println(num + " Es un numero par");
		}else {
			System.out.println(num + " No es un numero par");
		}

		en.close();

	}

}
