

//Q14.Write a java program to assign ticket price based on passenger age (child, adult, senior).

/*Age < 12 → Child → ₹50
Age 12 – 59 → Adult → ₹100
Age ≥ 60 → Senior → ₹70*/

import java.util.Scanner;
public class TicketPrice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter passenger age: ");
        int age =sc.nextInt();
        if(age < 0){
            System.out.println("Invalid age");
        } else if(age < 12){
            System.out.println("Category:Child");
            System.out.println("Ticket Price: ₹50");
        } else if(age < 60){
            System.out.println("Category:Adult");
            System.out.println("Ticket Price: ₹100");
        } else{
            System.out.println("Category:Senior");
            System.out.println("Ticket Price: ₹70");
        }
    }
}
