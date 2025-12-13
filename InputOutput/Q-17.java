import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String w1 = sc.next();
        System.out.print("Enter second word: ");
        String w2 = sc.next();
        System.out.println("\"" + w1 + " " + w2 + "\"");
    }
}