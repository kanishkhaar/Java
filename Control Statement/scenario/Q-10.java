

//Q10.Write a java program to print "Stop / Ready / Go" based on traffic light color.

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	      String color = sc.next();
	    
	      if(color.equals("red")){                     // .equals -> function use
	          System.out.println("Stop");
	      }
	      else if(color.equals("yellow")){
	          	          System.out.println("Ready");
	      }
	       else if(color.equals("green")){
	          	          System.out.println("Go");
	      }
	      else{
	          	          System.out.println("not a traffic color");
	      }
	      }
          }