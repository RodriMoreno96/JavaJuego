package Juego;

import java.util.Scanner;

import java.util.InputMismatchException;

public class Main {
	public static final int NUMERO_SECRETO = 6;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int intentos = 5;
		int Numero = 0;
		int aleatorio = (int) (Math.random() * 100);
		String opcion;
		System.out.println("JUEGO ADIVINAR NUMERO");

		System.out.println("\nMenu de opciones");
		System.out.println("1. Jugar");

		System.out.println("\nIngrese una opcion: ");

		opcion = scanner.nextLine();

		switch (opcion) {

		case "1":
			System.out.println("Elegir un Numero del 1 al 100: ");
			scanner.nextLine();			
			break;

		default:
			System.out.println("Opción no válida. Intente nuevamente.");
			break;
		}

		do {

			try {

				while (Numero != NUMERO_SECRETO && intentos >= 1) {
					intentos--;
					System.out.println("Error, el numero no es correcto, te quedan: " + intentos + " intentos ");

					Numero = scanner.nextInt();

					if (Numero == NUMERO_SECRETO && intentos < 5) {
						System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");

					}
					if (intentos == 0) {
						System.out.println("Se acabaron los intentos, gracias por participar.");

					}

					if (Numero < aleatorio) {
						System.out.println("EL NUMERO QUE BUSCA ES MAS ALTO");
						
					} else if (Numero > aleatorio)
						System.out.println("EL NUMERO QUE BUSCA ES MAS BAJO");
					
				}

			}

			catch (InputMismatchException e) {

				scanner.nextLine();
				System.out.println("ERROR, POR FAVOR VUELVA A INGRESAR UN NUMERO");

			}

		} while (intentos > 0 && intentos < 5);

		scanner.close();

	}

	public static void generarRenglonC() {
		System.out.println("___________\n");
	}

}
