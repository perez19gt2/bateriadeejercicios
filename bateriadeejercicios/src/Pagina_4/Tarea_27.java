package Pagina_4;

import java.util.Scanner;

public class Tarea_27 {

	public static void main(String[] args) {
		// Determinar el precio de un billete de ida y vuelta por avión,
		//conociendo la distancia a recorrer, el número de días de estancia y
		//sabiendo que, si la distancia es superior a 1000 Km, y el número de
		//días de estancia es superior a 7, la línea aérea le hace un descuento
		//del 30% (precio por kilómetro US$8.50).

		
		Scanner en = new Scanner(System.in);
		
		int estadia;
		double precioVuelo,distancia,descuento,pFinal;
		
		System.out.println("Ingrese la distancia que quiere recorrer: ");
		distancia = en.nextDouble();
		System.out.println("Ingrese los dias de estadia");
		estadia = en.nextInt();
		
		precioVuelo = distancia*8.50;
		descuento = (precioVuelo*30)/100;
		
		if(distancia > 1000 && estadia > 7) {
			pFinal = precioVuelo - descuento;
			System.out.println("El pago total es: " + pFinal + " dolares");
		}else {
			System.out.println("el pago total es: " + precioVuelo + " dolares");
		}
		
		
		en.close();
		
		
	}

}
