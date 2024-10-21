package Repaso.Clases.Ejercicio_01;

/**
 * Clase principal que contiene el método main.
 * Crea una instancia de Coche y muestra sus características.
 */
public class main_Coche {
    public static void main(String[] args) {
        // Crear una instancia de Coche
        Coche miCoche = new Coche("Toyota Corolla", 180);
        
        // Llamar al método mostrarCaracteristicas
        miCoche.mostrarCaracteristicas();
    }
}
