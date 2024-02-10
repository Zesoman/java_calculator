import java.util.Scanner;

public class getInput {
    public static float[] operands() {
        Scanner in = new Scanner(System.in);

        float a = 0;
        float b = 0;

        for (int i = 1; i <= 2; i++) {
            switch (i) {
                case 1:
                    System.out.println("Input first operand:");
                    a = in.nextFloat();
                    break;
                case 2:
                    System.out.println("Input second operand:");
                    b = in.nextFloat();
                    break;
            }
        }
        return new float[] {a, b};
    }
    public static String operation() {
        Scanner in = new Scanner(System.in);
        String pattern = "+-*/%";

        while (true) {
            System.out.println("Input arithmetic operation:");
            String o = in.nextLine();

            if (pattern.contains(o) && o.length() == 1) {
                return o;
            }
            else System.out.println("Error: invalid operation");
        }
    }
}
