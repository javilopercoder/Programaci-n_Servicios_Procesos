package Repaso.Clases.Ejercicio_02;

/**
 * Clase principal que contiene el método main.
 * Crea una instancia de Calculadora y utiliza sus métodos.
 */
public class main_Calculadora {
    public static void main(String[] args) {
        // Crear una instancia de Calculadora
        Calculadora calc = new Calculadora();
        
        // Definir dos números para las operaciones
        double num1 = 10;
        double num2 = 5;
        
        // Realizar operaciones
        double suma = calc.sumar(num1, num2);
        double resta = calc.restar(num1, num2);
        double multiplicacion = calc.multiplicar(num1, num2);
        double division = 0;
        
        try {
            division = calc.dividir(num1, num2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al dividir: " + e.getMessage());
        }
        
        // Mostrar los resultados
        System.out.println("Operaciones con los números " + num1 + " y " + num2 + ":");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        if (num2 != 0) {
            System.out.println("División: " + division);
        }
    }
}
