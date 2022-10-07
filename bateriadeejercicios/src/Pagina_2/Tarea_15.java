package Pagina_2;

import java.util.Scanner;

public class Tarea_15 {

	public static void main(String[] args) {
		// Teniendo en cuenta que la clave es “tuani”, escribir un programa que
		//nos pida una clave. Solo tenemos 3 intentos para acertar, si fallamos
		//los 3 intentos nos mostrará un mensaje indicándonos que hemos
		//agotado esos 3 intentos. Si acertamos la clave, saldremos
		//directamente del programa.
		
		int cont=0;
		String correctPass = "tuani";
		Scanner in = new Scanner(System.in);

		System.out.println("Ingrese su Contraseña");
		System.out.println("__________________________");
		cont++;
		System.out.print("Intento No." + cont);
		String pass = in.nextLine();

		
		if(pass.equals(correctPass)) {
			System.out.println("__________________________");
			System.out.println("Contraseña correcta");
			System.out.println("Fin");
			System.out.println("__________________________");
		}else {
			//bilingue profe
			while(!pass.equals(correctPass) && cont <3) {
				cont++;
				System.out.println("Contraseña incorrecta");
				System.out.println("__________________________");
				System.out.print("Intento No. " + cont + " ");
				pass = in.nextLine();

				if(pass.equals(correctPass)) {
					System.out.println("__________________________");
					System.out.println("Contraseña correcta");
					System.out.println("Fin");
					System.out.println("__________________________");
					break;
				}
			}
			System.out.println("__________________________");
			System.out.println("Cuenta bloqueada");
			System.out.println("__________________________");
		}
		in.close();
	}

}
