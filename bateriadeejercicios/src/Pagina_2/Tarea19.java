package Pagina2;

import java.util.Scanner;

public class Tarea19 {

	public static void main(String[] args) {
		
		Scanner SC=new Scanner(System.in);
		String alumno;

		double notafinal;

		double np;

		double npro;

		double nt;

		System.out.println("Introduce el nombre del alumno");

		alumno=SC.next();

		while (!alumno.equals("")) {

		System.out.println("Introduce la nota practica");

		np=SC.nextDouble();

		System.out.println("Introduce la nota de problemas");

		npro=SC.nextDouble();

		System.out.println("Introduce la nota de teoria");

		nt=SC.nextDouble();

		if ((np<=10 && np>=0) && (npro<=10 && npro>=0) && (nt<=10 && nt>=0)) {

		System.out.println("El alumno "+alumno);

		System.out.println("La nota practica es "+np);

		System.out.println("La nota de problemas es "+npro);

		System.out.println("La nota de teoria es "+nt);

		np=np*0.1;

		npro=npro*0.5;

		nt=nt*0.4;

		notafinal=np+npro+nt;

		System.out.println("La nota final es "+notafinal);

		} else {

		System.out.println("Has escrito una nota incorrecta, vuelve a intentarlo");

		}

		System.out.println("Introduce el nombre de otro alumno");

		alumno=SC.next();

		}
SC.close();
System.out.println("Fin del programa. Te amo Eli <3");
		}
	}


