import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        float[] operands = getInput.operands();
        String operation = getInput.operation();
        float result = 0;

        switch (operation) {
            case "+": {
                result = Array.getFloat(operands, 0) + Array.getFloat(operands, 1);
                System.out.println("Result: " + result);
            }
            case "-": {
                result = Array.getFloat(operands, 0) - Array.getFloat(operands, 1);
                System.out.println("Result: " + result);
                break;
            }
            case "*": {
                result = Array.getFloat(operands, 0) * Array.getFloat(operands, 1);
                System.out.println("Result: " + result);
                break;
            }
            case "/": {
                result = Array.getFloat(operands, 0) / Array.getFloat(operands, 1);
                System.out.println("Result: " + result);
                break;
            }
            case "%": {
                result = Array.getFloat(operands, 0) % Array.getFloat(operands, 1);
                System.out.println("Result: " + result);
                break;
            }
            default: System.out.println("Result: " + result);
        }
    }
}