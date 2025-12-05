package M1_Act2;
import java.util.Scanner;

public class M1_Activity2 {

	public static void main(String[] args) {
		// Create a Scanner object
				Scanner input = new Scanner(System.in);
				
				// Read user input
				System.out.print("Enter your age: ");
				String inpAge = input.nextLine();
				
				// Convert string to integer
				int intAge = Integer.parseInt(inpAge);
				
				double doubleAge = Double.parseDouble(inpAge);
				
				//Display output 
				System.out.println("Your age as int: " + intAge);
				System.out.println("Your age as double: " + doubleAge);
				

	}

}
