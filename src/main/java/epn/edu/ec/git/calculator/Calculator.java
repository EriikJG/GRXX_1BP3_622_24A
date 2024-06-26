package epn.edu.ec.git.calculator;

public class Calculator {
    private int answer;

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public double division(int a, int b) {
        return a / b;
    }

    public double multiplication(int a, int b) {
        return a * b;
    }
    public double potenciacion(int a, int b) {
        return Math.pow(a, b);
    }


    public void timeout(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
