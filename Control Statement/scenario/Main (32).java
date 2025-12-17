


//Q17.Write a java program to assign different ticket prices based on day of the week (weekday/weekend).
    
    
 import java.util.Scanner;
class TicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day: ");
        String day = sc.next();
        if (day.equals("Saturday")||day.equals("Sunday")) {
            System.out.println("Ticket Price: 150");
        } else {
            System.out.println("Ticket Price: 100");
        }
    }
}
