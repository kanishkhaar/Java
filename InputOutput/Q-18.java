import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your date of birth (DD/MM/YYYY): ");
        String dob = sc.nextLine();
        System.out.println(dob);
    }
}