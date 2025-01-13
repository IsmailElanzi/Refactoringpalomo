package refactoring;

class Vehiculo {
    String marca;
    String modelo;
    int anio;
    int velocidadMaxima;
    
    // Constructor
    public Vehiculo(String marca, String modelo, int anio, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}

class Coche extends Vehiculo {
    int numPuertas;
    
    // Constructor
    public Coche(String marca, String modelo, int anio, int velocidadMaxima, int numPuertas) {
        super(marca, modelo, anio, velocidadMaxima);
        this.numPuertas = numPuertas;
    }
    
    // Sobrescribiendo el método para mostrar información
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de puertas: " + numPuertas);
    }
}

class Motocicleta extends Vehiculo {
    boolean tieneSidecar;
    
    // Constructor
    public Motocicleta(String marca, String modelo, int anio, int velocidadMaxima, boolean tieneSidecar) {
        super(marca, modelo, anio, velocidadMaxima);
        this.tieneSidecar = tieneSidecar;
    }
    
    // Sobrescribiendo el método para mostrar información
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("¿Tiene sidecar? " + (tieneSidecar ? "Sí" : "No"));
    }
}