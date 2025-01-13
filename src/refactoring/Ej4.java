package refactoring;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		var sc = new Scanner(System.in);

		System.out.println("inserte caracter");
		char car = sc.next().charAt(0);

		System.out.println("inserte  m para minuscula y M para matuscula");
		char elec = sc.next().charAt(0);

		if (Character.isLetter(car)) {

			if (elec == 'm') {

				if (Character.isLowerCase(car)) {

					System.out.println("es verdadero");

				} else {

					System.out.println("es falso");

				}

			} else if (elec == 'M') {

				if (Character.isUpperCase(car)) {

					System.out.println("es verdadero");

				} else {

					System.out.println("es falso");
				}
			}
		} else {

			System.out.println("inserte una letra");

		}
		sc.close();

	}

}
