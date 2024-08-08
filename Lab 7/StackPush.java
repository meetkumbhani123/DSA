import java.util.*;

public class StackPush {
    int top = -1;
    int size = 5;
    int stack[] = new int[size];

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        } else {
            top++;
            stack[top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1; 
        } else {
            return stack[top--];
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1; 
        } else {
            return stack[top];
        }
    }
}