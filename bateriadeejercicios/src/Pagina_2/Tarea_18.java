package Pagina_2;

import java.util.Scanner;

public class Tarea_18 {

	public static void main(String[] args) {
		// Leer tres números que denoten una fecha (día, mes, año).
	//	Comprobar que es una fecha válida. Si no es válida escribir un
		//mensaje de error. Si es válida escribir la fecha cambiando el número
	//	del mes por su nombre. Ej. Si se introduce 1 2 2021, se deberá
		// imprimir “1 de febrero de 2021”. El año debe ser mayor que 0.
		
		Scanner entrada = new Scanner(System.in);
		
		int d,m,a;

		String nombremes="";
		
		System.out.print("Ingrese el dia: ");
		d = entrada.nextInt();
		System.out.print("Ingrese el mes: ");
		m = entrada.nextInt();
		System.out.print("Ingrese el anio: ");
		a = entrada.nextInt();
		
		if(d < 1 || d > 31) {
			do {
				System.out.println("Dia fuera de rango");
				System.out.println("Ingrese el dia: ");
				d = entrada.nextInt();
			}while(d>0 && d < 32);
		}
		if(m < 1 || m > 12) {
			do {
				System.out.println("Mes fuera de rango");
				System.out.println("Ingrese un mes: ");
				m = entrada.nextInt();
			}while(m>0 && d < 13);
		}
		if(a < 1) {
			do {
				System.out.println("Anio fuera de rango");
				System.out.println("Ingrese un anio: ");
				a = entrada.nextInt();
			}while(a > 0);
		}
		
		switch(m) {
		
		case 1: nombremes = "Enero";
		case 2: nombremes = "Febrero";
		case 3: nombremes = "Marzo";
		case 4: nombremes = "Abril";
		case 5: nombremes = "Mayo";
		case 6: nombremes = "Junio";
		case 7: nombremes = "Julio";
		case 8: nombremes = "Agosto";
		case 9: nombremes = "Septiembre";
		case 10: nombremes = "Octubre";
		case 11: nombremes = "Noviembre";
		case 12: nombremes = "Diciembre";
		
		}
		
		System.out.println(d + " de " + nombremes + " de " + a);
		entrada.close();
	}

}
