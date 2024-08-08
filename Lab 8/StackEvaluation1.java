import java.util.Stack;
import java.util.Scanner;

public class StackEvaluation1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a prefix expression: ");
        String prefixExpression = scanner.nextLine();
        scanner.close();

        int result = evaluatePrefix(prefixExpression);
        System.out.println("Result: " + result);
    }

    public static int evaluatePrefix(String prefixExpression) {
        if (prefixExpression == null || prefixExpression.isEmpty()) {
            System.out.println("Invalid prefix expression");
            return -1;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = prefixExpression.length() - 1; i >= 0; i--) {
            char c = prefixExpression.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                if (stack.size() < 2) {
                    System.out.println("Invalid prefix expression");
                    return -1;
                }

                int operand1 = stack.pop();
                int operand2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        if (operand2 == 0) {
                            System.out.println("Division by zero is not allowed");
                            return -1;
                        }
                        stack.push(operand1 / operand2);
                        break;
                    default:
                        System.out.println("Invalid operator: " + c);
                        return -1;
                }
            }
        }

        if (stack.size() != 1) {
            System.out.println("Invalid prefix expression");
            return -1;
        }

        return stack.pop();
    }
}