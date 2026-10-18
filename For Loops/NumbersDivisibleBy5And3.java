import java.util.Scanner;
public class WorkSpace{
  public static void main(String[] args){
  
  Scanner inputtaker = new Scanner(System.in);
    System.out.print("Enter a number : ");
  	int number = inputtaker.nextInt();
  
  	for(int index = 1; index <= number; index++){
  		if (index % 3 == 0){
  		    if (index % 5 == 0){
  		 System.out.println(index); 
  		}
  	}
  	}
  }

  }
