package Pagina_2;

public class Tarea_11 {

	public static void main(String[] args) {
		// Desarrollar un programa que nos calcule el cuadrado de los 9
		//primeros números naturales.

		int total = 9;
		double cuadrado;
		
		System.out.println("Se muestran los primeros 9 numeros naturales");
		for (int i = 1; i <= total; i++) {
			cuadrado = Math.pow(i, 2);
			System.out.println("  "+ i + "-- Elevado al cuadrado es: " + cuadrado);

		}
		
		
	}

}
