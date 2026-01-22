

//Q7.Write a java Program to Distribute Candies Equally Among People


//bits=bytes*8                      

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
         int candies=sc.nextInt();
         int people=sc.nextInt();      
        int perperson=candies/people;
        int leftover=candies%people;
        System.out.println("perperson: " +perperson);
         System.out.println("leftover : "+leftover);
    }
}