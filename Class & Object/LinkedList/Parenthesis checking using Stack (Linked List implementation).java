//Parenthesis checking using Stack (Linked List implementation)


import java.util.Scanner;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}   

// Stack implementation using Linked List
class StackLL {
    Node top = null;

    // Push operation
    void push(char c) {
        Node newNode = new Node(c);
        newNode.next = top;
        top = newNode;
    }

    // Pop operation
    char pop() {
        if (top == null) {
            return '#'; // special value for empty stack
        }
        char val = top.data;
        top = top.next;
        return val;
    }

    // Check if stack is empty
    boolean isEmpty() {
        return top == null;
    }
}

// Main class
public class Main {

    // Function to check matching brackets
    static boolean isMatchingPair(char open, char close) {
        if (open == '(' && close == ')') return true;
        if (open == '{' && close == '}') return true;
        if (open == '[' && close == ']') return true;
        return false;
    }

    // Function to check balanced parentheses
    static boolean areParenthesesBalanced(String expr) {
     StackLL stack = new StackLL();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            // Opening brackets → push
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets → pop and compare
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char popped = stack.pop();

                if (!isMatchingPair(popped, ch)) {
                    return false;
                }
            }
        }

        // If stack is empty → balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        System.out.print("Enter expression: ");
        String expr = sc.nextLine();

        if (areParenthesesBalanced(expr)) {
            System.out.println("Balanced Parentheses");
        } else {
            System.out.println("Not Balanced");
        }

        sc.close();
    }
}
