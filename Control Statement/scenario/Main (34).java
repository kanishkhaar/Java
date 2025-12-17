

//Q19.Write a java program to display mobile data usage alert – "Low Data", "Half Consumed", or "Data Over" based on usage.

/*Usage < 50% → Low Data

Usage = 50% → Half Consumed

Usage > 100% → Data Over

Otherwise (50% < usage ≤ 100%) → Data Available*/

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data usage percentage: ");
        int usage = sc.nextInt();
        if (usage < 50) {
            System.out.println("Low Data");
        } else if (usage == 50) {  
            System.out.println("Half Consumed");
        } else if (usage > 100) {
            System.out.println("Data Over");
        } else {
            System.out.println("Data Available");
        }
    }
}
