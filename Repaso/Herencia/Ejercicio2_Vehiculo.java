package Repaso.Herencia;

// Clase base Vehiculo
class Vehiculo {
    // Atributos comunes
    protected String marca;
    protected String modelo;
    protected int año;

    // Constructor
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Método para mostrar los datos del vehículo
    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}

// Clase Coche que hereda de Vehiculo
class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, String modelo, int año, int numeroDePuertas) {
        super(marca, modelo, año);
        this.numeroDePuertas = numeroDePuertas;
    }

    // Sobrescribir mostrarDatos() para incluir el número de puertas
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de puertas: " + numeroDePuertas);
    }
}

// Clase Motocicleta que hereda de Vehiculo
class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, int año, boolean tieneSidecar) {
        super(marca, modelo, año);
        this.tieneSidecar = tieneSidecar;
    }

    // Sobrescribir mostrarDatos() para incluir si tiene sidecar
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}

// Clase Camion que hereda de Vehiculo
class Camion extends Vehiculo {
    private double capacidadCarga; // en toneladas

    public Camion(String marca, String modelo, int año, double capacidadCarga) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    // Sobrescribir mostrarDatos() para incluir la capacidad de carga
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
    }
}

// Clase Main para probar la jerarquía de clases
public class Ejercicio2_Vehiculo {
    public static void main(String[] args) {
        Vehiculo coche = new Coche("Toyota", "Corolla", 2020, 4);
        Vehiculo motocicleta = new Motocicleta("Harley-Davidson", "Street 750", 2018, true);
        Vehiculo camion = new Camion("Volvo", "FH16", 2015, 18.0);

        System.out.println("Datos del Coche:");
        coche.mostrarDatos();
        System.out.println("\nDatos de la Motocicleta:");
        motocicleta.mostrarDatos();
        System.out.println("\nDatos del Camion:");
        camion.mostrarDatos();
    }
}
