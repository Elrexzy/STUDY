import java.util.Scanner;
public class WorkSpace{
  public static void main(String[] args){
  
  	int total = 0;
  	int index = 1; 
  	  while (index <= 5){
  	    Scanner inputtaker = new Scanner(System.in);
  	     System.out.print("Enter your number " + index + " : ");
  	     int number = inputtaker.nextInt();
  	     	total = total + number;
  		        index++;    
  		  }  
  		  	System.out.println(total);
  	}
  }
