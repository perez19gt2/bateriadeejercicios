package Pagina_3;

import java.util.Scanner;

public class Tarea_23 {

	public static void main(String[] args) {
		// El siguiente es el menú de un restaurante de bocadillos. Diseñar un
	//	programa capaz de leer el número de unidades consumidas de cada
		//alimento ordenado y calcular la cuenta total. Vamos a suponer que
	//	estos precios son fijos
		
		Scanner entrada = new Scanner(System.in);
		
		byte  op;
		double total = 0;
		String orden = "";
		
		System.out.println("----- Bocadillos Restaurant ----- \n");
		
		do {

			
			System.out.println("1) Bocadillo de jamon ----- $ 1,5");
			System.out.println("2) Refresco de Cacao ----- $ 1,05");
			System.out.println("3) Cervezita Victoria ----- $ 0,75");
			System.out.println("4) --------------- TERMINAR PEDIDO");
			System.out.println("");
			System.out.println("Seleccionar Opcion: "); op = entrada.nextByte();
			
			while(op <= 0) {
				System.out.println("Elija una opcion correcta por favor");
				op = entrada.nextByte();
			}
			
			switch(op) {
			
			
			
			case 1: 
				System.out.println("Ha elegido Bocadillo de jamon \nDesea elegir algo mas? \n");
				if(op == 1) {
					total += 1.5;
					orden += "Bocadillo de jamon $ 1,5 \n";
				}
				break;
			case 2: 
				System.out.println("Ha elegido Refresco de Cacao \nDesea elegir algo mas? \n");
				if(op == 2) {
					total += 1.05;
					orden += "Regresco de Cacao $ 1,05 \n";
				}
				break;
			case 3: 

				System.out.println("Ha elegido Cervezita Victoria \nDesea elegir algo mas? \n");
				if(op == 3) {
					total += 0.75;
					orden += "Cervezita Victoria $ 0,75 \n";
				}
				break;
			case 4: 

				System.out.println("---- Factura ----");
				System.out.println(orden);
				System.out.println("el total de su pedido es: " + total);
				break;
				}

		}while(op != 4);

		
		entrada.close();
	}

}
