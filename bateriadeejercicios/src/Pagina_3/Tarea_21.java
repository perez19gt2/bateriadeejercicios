package Pagina_3;

import java.util.Scanner;

public class Tarea_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int altura = 0,i;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese la altura: ");
		altura = entrada.nextInt();
		
		
		if(altura > 0 && altura <= 20) {
			
			for(i = 1; i <= altura; i++) {
				for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
			}
		}else {
			System.out.println("El rango ingresado no es valido \n fin");
			}
		
entrada.close();
	}
}

