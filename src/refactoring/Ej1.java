package refactoring;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora básica");

        int opcion = obtenerOpcion(sc);
        if (opcion == -1) {
            System.out.println("Opción no válida. Intenta de nuevo.");
            sc.close();
            return;
        }

        double numero1 = obtenerNumero(sc, "Ingresa el primer número:");
        double numero2 = obtenerNumero(sc, "Ingresa el segundo número:");

        realizarOperacion(opcion, numero1, numero2);

        sc.close();
    }

    private static int obtenerOpcion(Scanner sc) {
        System.out.println("Selecciona una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int opcion = sc.nextInt();
        return (opcion >= 1 && opcion <= 4) ? opcion : -1;
    }

    private static double obtenerNumero(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        return sc.nextDouble();
    }

    private static void realizarOperacion(int opcion, double numero1, double numero2) {
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("Error: No se puede dividir entre cero.");
                } else {
                    System.out.println("El resultado de la división es: " + (numero1 / numero2));
                }
                break;
            default:
                System.out.println("Operación no válida.");
        }
    }
}

