package epn.edu.ec.git.calculator;


public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Calculator
        Calculator calculator = new Calculator();

        // Prueba de la suma
        int sum = calculator.addition(5, 3);
        System.out.println("Suma: " + sum);

        // Prueba de la resta
        int difference = calculator.subtraction(8, 4);
        System.out.println("Resta: " + difference);
        // Prueba de la multiplication
        double multiplicationResult = calculator.multiplication(10, 2);
        System.out.println("Multiplicacion: " + multiplicationResult);

        // Prueba de la división
        double divisionResult = calculator.division(10, 2);
        System.out.println("División: " + divisionResult);

        System.out.println("INCLUSION DE LA POTENCIACION");
        //Inclusion de la Potenciacion
        double potentiationResult = calculator.potenciacion(10, 2);
        System.out.println("Potenciacion: " + potentiationResult);

    }
}

