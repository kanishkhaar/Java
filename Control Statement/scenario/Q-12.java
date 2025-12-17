 

//Q12.Write a java program to show weather condition (cold, pleasant, hot, heatwave) based on temperature.


/*Temperature < 15°C → Cold
Temperature 15°C – 25°C → Pleasant
Temperature 26°C – 35°C → Hot
Temperature > 35°C → Heatwave */


import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        int temp = sc.nextInt();
        if (temp < 15) {
            System.out.println("Weather Condition: Cold");
        } else if (temp <= 25) {
            System.out.println("Weather Condition: Pleasant");
        } else if (temp <= 35) {
            System.out.println("Weather Condition: Hot");
        } else {
            System.out.println("Weather Condition: Heatwave");
        }
    }
}
