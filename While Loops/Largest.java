import java.util.Scanner;
public class Largest{
  public static void main(String[] args){
  
  Scanner inputTaker = new Scanner(System.in);
	int index = 1;
	int largest = 0;
	while(index <= 5){
	System.out.print("Enter a number: ");
	int number = inputTaker.nextInt();
  	if (largest < number){
  	    largest = number;
  	    
  	    }
  	    
  	index++;
	}
	System.out.println("Largest: " + largest);
	}
}
