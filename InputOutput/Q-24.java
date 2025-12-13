import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours (HH): ");
        int hh = sc.nextInt();
        System.out.print("Enter minutes (MM): ");
        int mm = sc.nextInt();
        System.out.print("Enter seconds (SS): ");
        int ss = sc.nextInt();
        System.out.println(hh + ":" + mm + ":" + ss);
    }
}