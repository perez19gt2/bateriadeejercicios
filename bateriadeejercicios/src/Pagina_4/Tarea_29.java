package Pagina_4;

import java.util.Scanner;

public class Tarea_29 {

	public static void main(String[] args) {
		// Dados 3 números, determinar si la suma de dos de ellos es igual al
	//	tercero. Si se cumple, escribir “iguales”, si no, escribir “distintos”
		
		Scanner en = new Scanner(System.in);
		
	int n1,n2,n3;
	
	System.out.print("Introduzca el primer numero: ");
	n1 = en.nextInt();
	System.out.print("Introduzca el primer numero: ");
	n2 = en.nextInt();
	System.out.print("Introduzca el primer numero: ");
	n3 = en.nextInt();
		
	if(n1 + n2 == n3) {
		System.out.println("Los numeros [" + n1 + "] ["+ n2 + "] son iguales a num3 que es: " + n3);
	}else {
		System.out.println("Los numeros [" + n1 + "] ["+ n2 + "] son diferentes a num3 que es: " + n3);
	}
	
		en.close();

	}

}
