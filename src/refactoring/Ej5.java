package refactoring;

public class Ej5 {
	    public static void main(String[] args) {
	        Vehiculo vehiculo1 = new Coche("Toyota", "Corolla", 2020, 180, 4);
	        Vehiculo vehiculo2 = new Motocicleta("Harley-Davidson", "Sportster", 2022, 200, true);

	        vehiculo1.mostrarInformacion();
	        System.out.println();
	        vehiculo2.mostrarInformacion();
	    
	}

}
