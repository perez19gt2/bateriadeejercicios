package Pagina_4;

import java.util.Scanner;

public class Tarea_24 {

	public static void main(String[] args) {
		// Programa que nos calcule las raíces de una ecuación de segundo
		// grado. Controlar el caso de que las soluciones sean imaginarias.
		
		
		Scanner entrada = new Scanner(System.in);
		
		int a,b,c;

		
		System.out.print("ingrese el valor de a:");
		a = entrada.nextInt();
		System.out.print("ingrese el valor de b:");
		b = entrada.nextInt();
		System.out.print("ingrese el valor de c:");
		c = entrada.nextInt();
		
		double det = Math.pow(b,2)-(4*a*c);
		
		if(det > 0) {
			double op1,op2;
			
			op1 = (b*(-1) + Math.sqrt(det)) / (2*a);
			op2 = ((b*(-1) - Math.sqrt(det)) / (2*a));
			
			System.out.println("El valor op1 es: "+op1);
			System.out.println("El valor op2 es: "+op2);
		}else {
			System.out.println("Con numero negativo no puede continuar el programa");
		}
		
		
		
		
		entrada.close();
	}

}
