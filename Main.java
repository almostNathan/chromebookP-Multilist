import java.util.Scanner;

public class Main{

	public static void main(String[] args){
//		MyLinkedList database = new MyLinkedList();
					
		System.out.println("The database is currently empty, please add the first entry."); 
	
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		String[] userInputArray = userInput.split(",");

		System.out.println("You Entered" + userInputArray[0] + " " + userInputArray[1]);

	
	}

	public void startUp(MyLinkedList database){
	
		System.out.println("The database is currently empty, please add the first entry.");
		getInput(database);	

	
	}

	public void getInput(MyLinkedList database){
		
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		String[] userInputArray = userInput.split(",");

		System.out.println("You Entered" + userInputArray[0] + " " + userInputArray[1]);
	}
}
