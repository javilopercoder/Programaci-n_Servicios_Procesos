package Repaso.Clases.Ejercicio_01;

/**
 * Define una clase Coche que tenga como atributos el modelo y la velocidadMaxima.
 * Añade un método mostrarCaracteristicas() que imprima los datos del coche.
 */
public class Coche {
    // Atributos privados de la clase
    private String modelo;
    private int velocidadMaxima;

    // Constructor de la clase Coche
    public Coche(String modelo, int velocidadMaxima) {
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método para mostrar las características del coche
    public void mostrarCaracteristicas() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
    }

    // Métodos getters y setters (Opcional)
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}
