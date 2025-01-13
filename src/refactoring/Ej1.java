package refactoring;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);

		System.out.println("Bienvenido a la calculadora básica");
		System.out.println("Selecciona una operación:");
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");

		int opcion = sc.nextInt();

		if (opcion < 1 || opcion > 4) {
			System.out.println("Opción no válida. Intenta de nuevo.");
		}

		System.out.println("Ingresa el primer número:");
		double numero1 = sc.nextDouble();

		System.out.println("Ingresa el segundo número:");
		double numero2 = sc.nextDouble();

		if (opcion == 1) {
			double resultado = numero1 + numero2;
			System.out.println("El resultado de la suma es: " + resultado);
		} else if (opcion == 2) {
			double resultado = numero1 - numero2;
			System.out.println("El resultado de la resta es: " + resultado);
		} else if (opcion == 3) {
			double resultado = numero1 * numero2;
			System.out.println("El resultado de la multiplicación es: " + resultado);
		} else if (opcion == 4) {
			if (numero2 == 0) {
				System.out.println("Error: No se puede dividir entre cero.");
			} else {
				double resultado = numero1 / numero2;
				System.out.println("El resultado de la división es: " + resultado);
			}
		}

		sc.close();
	}
}
