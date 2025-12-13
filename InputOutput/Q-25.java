import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Address Line 1: ");
        String line1 = sc.nextLine();
        System.out.print("Enter Address Line 2: ");
        String line2 = sc.nextLine();
        System.out.print("Enter Address Line 3: ");
        String line3 = sc.nextLine();
        System.out.println(line1 + "\n" + line2 + "\n" + line3);
    }
}