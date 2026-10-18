import java.util.Scanner;
public class WorkSpace{
  public static void main(String[] args){
  
  Scanner inputtaker = new Scanner(System.in);
  
    String username = "Elrexzy";
  	String password = "Abcd";
    System.out.print("Enter your password: ");
    String passkey  = inputtaker.nextLine();
    
    System.out.print("Enter your Username: ");
      String user  = inputtaker.nextLine();
  	  while (!passkey && username.equalsIgnoreCase(password) && (user)){
  	     	System.out.print("Either password or username is wrong: ");
  	     	user = inputtaker.nextLine();
  	     	passkey  = inputtaker.nextLine();

  	     	} 	
  	     	if (passkey && username.equalsIgnoreCase(password) && (user)){
  	  	  System.out.println("Welcome to your dashboard!");
  	  	  }
  	}
  }
