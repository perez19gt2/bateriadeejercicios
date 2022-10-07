package Pagina_1;

public class Tarea_07 {

	public static void main(String[] args) {
		// Una tienda ofrece un descuento del 15% sobre el total de la compra
		//durante el mes de febrero. Dado un mes y un importe (monto),
	//	calcular cuál es la cantidad que se debe cobrar al cliente.
		
		double monto = 10000, montototal;
		String mes = "Febrero";
		int descuento = 15;
		double ope;
		
		System.out.println("**************El mes actual es: " + mes+" **************");
		System.out.println("El monto sin el " + descuento + "% de descuento es: "+ monto + " Cordobas");
		ope = (descuento*monto)/100;
		System.out.println("Su " + descuento + "% de descuento es de : " + ope);
		
		montototal = monto - ope;
		System.out.println("El monto con el descuento aplicado es:  " + montototal + " Cordobas.\n");
		System.out.println("***************** GRACIELA POR SU COMPRA *****************");

	}

}
