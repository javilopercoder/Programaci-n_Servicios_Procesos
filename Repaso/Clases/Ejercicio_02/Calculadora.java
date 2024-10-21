package Repaso.Clases.Ejercicio_02;

/**
 * Clase Calculadora que proporciona métodos para sumar, restar, multiplicar y dividir dos números.
 */
public class Calculadora {
    
    /**
     * Suma dos números.
     * @param a Primer número.
     * @param b Segundo número.
     * @return La suma de a y b.
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Resta dos números.
     * @param a Número del cual se resta.
     * @param b Número a restar.
     * @return La diferencia entre a y b.
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Multiplica dos números.
     * @param a Primer número.
     * @param b Segundo número.
     * @return El producto de a y b.
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Divide dos números.
     * @param a Dividendo.
     * @param b Divisor.
     * @return El cociente de a dividido por b.
     * @throws IllegalArgumentException Si el divisor es cero.
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero.");
        }
        return a / b;
    }
}