import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.next();
        int number = Integer.parseInt(hex, 16);
        System.out.println("Integer: " + number);
    }
}