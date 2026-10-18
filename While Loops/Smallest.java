import java.util.Scanner;
public class Smallest{
  public static void main(String[] args){
  
  Scanner inputTaker = new Scanner(System.in);
   System.out.print("Enter a number: " );
	int numberOne = inputTaker.nextInt();
	int smallest = numberOne;
	int index = 1;
	
	while(index < 3){
	    System.out.print("Enter a number: ");
	     int number = inputTaker.nextInt();
	     
  	if(smallest > number){
  	  smallest = number;
  	  }  
  	index++;
	}
	System.out.println("smallest: " + smallest);
	}
}
