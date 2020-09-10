package ejercicios;

import java.util.Scanner;

//Ejercicio:
//Se tiene una linea de 4 cajas donde se cobran facturas que luego seran cargadas 
//en el sistema.
//Se solicitara el numero de caja y el importe cobrado. La carga finaliza con importe cero.
//Informar la cantidad de facturas cobradas por cada caja y el promedio de todas las 
//facturas

public class Ejercicio999CajasCobranza {

	private static final int CANT_CAJAS = 4;
	int cajas[] = new int[4];

	public static void main(String[] args) {
		int totalCajas = 0;
		System.out.println("Ingrese importe");
		Scanner sc = new Scanner(System.in);
		double importe = sc.nextDouble();

		while (importe > 0) {
			System.out.println("Ingrese numero de caja 1- ; 2- ; 3- ; 0 para terminar");
			Scanner sc1 = new Scanner(System.in);
			int caja = sc1.nextInt();

		}

	}

}
