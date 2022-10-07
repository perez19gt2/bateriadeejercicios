package Pagina_2;

public class Tarea_17 {
	public static void main(String[] args) {
		// Programa que visualice la cuenta de los números que son múltiplos
	//	de 2 o de 3 que hay entre 1 y 100.
		
		int x=1, y=0, z=0;
		
		while(x <=100) {
			
			if(x % 2 == 0) {
				y = y + 1;
				System.out.println("Multiplo de 2: " + x);
			}
			if(x % 3 == 0) {
				z = z + 1;
				System.out.println("Multiplo de 3: " + x);
			}
			
			x = x + 1;
		}
		
		System.out.println("Numeros multiplos de 2: " + y);
		System.out.println("Numeros multiplos de 3: "  + z);

	}
}
