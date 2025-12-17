


//Q13.Write a java program to display mobile battery status (full, moderate, low).



import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter battery percentage: ");
        int battery = sc.nextInt();
        if (battery >= 80 && battery <= 100) {
            System.out.println("Battery Status: Full");
        } else if (battery >= 30) {
            System.out.println("Battery Status: Moderate");
        } else if (battery >= 0) {
            System.out.println("Battery Status: Low");
        } else {
            System.out.println("Invalid battery percentage");
        }
    }
}
