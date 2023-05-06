package Calculator_Sample;
import java.util.Scanner;

public class Calculator {
    public interface MathOperation {
        int Perform_Operation(int x, int y);
    }

    /*A get_operation method tht will take a string operator and returns the appropriete
    Mathematical operation as a MathOperation Object*/
    private static MathOperation Get_Operation(String operator) {
        switch (operator) {
            case "+":
                return ((x, y) -> x + y);
            case "-":
                return ((x, y) -> x - y);
            case "*":
                return ((x, y) -> x * y);
            case "/":
                return ((x, y) -> x / y);
            case "%":
                return ((x, y) -> x % y);
            default:
                return null;

        }
    }
}/*
    public static void main(String[] args) {
        if (args.length != 3)
        {
            System.out.println("Please argument count should be exactly 3!");
            return;
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);
        String operator = args[1];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first operand:");
        int x = scanner.nextInt();

        //System.out.println("Enter operator (+,-,*,/,%):");
        String operator = scanner.next();

       //5 System.out.println("Enter second operand:");
        int y = scanner.nextInt();
        MathOperation Operation = Get_Operation(operator);
        if (operator == null)
        {
            System.out.println("Invalid operator: selects operator from \"+\",\"-\", \"*\", \"/\" and \"%\".");
            return;
        }

        int result = Operation.Perform_Operation(x, y);
        System.out.println(result);

    }
}
*/