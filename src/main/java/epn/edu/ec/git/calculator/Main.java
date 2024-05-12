package epn.edu.ec.git.calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Calculator
        Calculator calculator = new Calculator();

        // Crear un Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer número
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        // Pedir al usuario que ingrese el segundo número
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        // Prueba de la suma
        int sum = calculator.addition(num1, num2);
        System.out.println("Suma: " + sum);

        // Prueba de la resta
        int difference = calculator.subtraction(num1, num2);
        System.out.println("Resta: " + difference);

        // Prueba de la multiplicación
        double multiplicationResult = calculator.multiplication(num1, num2);
        System.out.println("Multiplicación: " + multiplicationResult);

        // Prueba de la división
        double divisionResult = calculator.division(num1, num2);
        System.out.println("División: " + divisionResult);

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
