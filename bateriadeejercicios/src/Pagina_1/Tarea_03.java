package Pagina_1;

public class Tarea_03 {

	public static void main(String[] args) {
		// Programa que lea tres números distintos y nos diga cuál de ellos es
		//el mayor.

		int num1,num2,num3;
		
		num1 = 1;
		num2 = 0;
		num3 = 3;
		
		System.out.println("Los numeros son: " + num1 + "\t" + num2 + "\t" + num3);
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("El numero mayor es: " + num1);
		}else if(num2 > num1 && num2 > num3) {
			System.out.println("El numero mayor es: " + num2);
		}else if(num3 > num1 && num3 > num2) {
			System.out.println("El numero mayor es: " + num3);
		}else if(num1 == num2 || num1 == num3 || num2 == num3 || num3 == num1) {
			System.out.println("Hay dos numeros que son igual de mayores");
		}
		else if(num1 == num2 && num1 == num3){
			System.out.println("Los numeros: " + num1 +", "+ num2 +", " +  num3 + " son iguales");
		}
	}

}
