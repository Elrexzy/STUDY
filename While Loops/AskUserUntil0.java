import java.util.Scanner;
public class WorkSpace{
  public static void main(String[] args){
  
  	
  	int index = 1; 
  	  while (index != 0){
  	    Scanner inputtaker = new Scanner(System.in);
  	     System.out.print("Enter your number " + index + " : ");
  	     int number = inputtaker.nextInt();
  	     	index++;  
  	     	 if (number == 0){
  	     		  break;
  		}  
  		} 	
  	}
  }
