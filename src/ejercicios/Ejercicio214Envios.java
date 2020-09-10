package ejercicios;

import java.util.Scanner;

public class Ejercicio214Envios {

	/*
	 * Una compa��a de paqueter�a internacional tiene servicio en algunos pa�ses de
	 * Am�rica del Norte, Am�rica Central, Am�rica del Sur, Europa y Asia. El costo
	 * por el servicio de paqueter�a se basa en el peso del paquete y la zona a la
	 * que va dirigido. Lo anterior se muestra en la siguiente tabla: Parte de su
	 * pol�tica implica que los paquetes con un peso superior a 5 kg no son
	 * transportados, esto por cuestiones de log�stica y de seguridad. Realice un
	 * algoritmo para determinar el cobro por la entrega de un paquete o, en su
	 * caso, el rechazo de la entrega; repres�ntelo mediante diagrama de flujo y
	 * pseudoc�digo.
	 */

	// definmos zona como float

	private static final int zona_1 = 11;
	private static final int zona_2 = 10;
	private static final int zona_3 = 12;
	private static final int zona_4 = 24;
	private static final int zona_5 = 27;
	private static final int PESO_MAX = 5000;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese peso en gramos");
		int peso = sc.nextInt();

		if (peso > 0 && peso <= PESO_MAX) {

			System.out.println("Siendo America norte 1, central 2, sur 3,");
			System.out.println("Ingrese zona de envio");
			int zona = sc.nextInt();
			sc.close();

			int costoEnvio = 0;
			switch (zona) {
			case 1:
				costoEnvio = peso * zona_1;
				break;
			case 2:
				costoEnvio = peso * zona_2;
				break;
			case 3:
				costoEnvio = peso * zona_3;
				break;
			default:
				System.out.println("Zona incorrecta");
			}

			System.out.println("El costo del envio sera de:" + costoEnvio);

		} else {
			System.out.println("sin servicio en la zona");
		}

	}
}
