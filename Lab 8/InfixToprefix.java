import java.util.Stack;


    


public class InfixToprefix {
    
    
    
    private static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }
    
    
    private static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    
   
    public static String infixToPrefix(String infix) {
        StringBuilder prefix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        
        StringBuilder reversedInfix = new StringBuilder(infix).reverse();
        
        for (int i = 0; i < reversedInfix.length(); i++) {
            char c = reversedInfix.charAt(i);
            
            
            if (!isOperator(c)) {
                prefix.append(c);
            } else {
               
                while (!stack.isEmpty() && getPrecedence(c) < getPrecedence(stack.peek())) {
                    prefix.append(stack.pop());
                }
                stack.push(c);
            }
        }
        
      
        while (!stack.isEmpty()) {
            prefix.append(stack.pop());
        }
        
        return prefix.reverse().toString();
    }
    
    public static void main(String[] args) {
        String infixExpression = "A+B*C-D/E";
        String prefixExpression = infixToPrefix(infixExpression);
        System.out.println("Prefix Expression: " + prefixExpression);
    }
}
