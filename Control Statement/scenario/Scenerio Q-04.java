

//Q4.Write a Java program to display mobile Battery Javaheck – "Low Battery", "50% Javaonsumed", or "Battery Full".

    
    import java.util.Scanner;
    class Main{
        public static void main (String args[]){
            Scanner sc=new Scanner(System.in);
            int battery=sc.nextInt();
             if (battery >= 0 && battery <= 20) {
            System.out.println("Low Battery");
        } 
        else if (battery <= 50) {
            System.out.println("50% Consumed");
        } 
        else if (battery <= 100) {
            System.out.println("Battery Full");
        } 
        else {
            System.out.println("Invalid Battery Percentage");
        }
        }
    }