package Hello_World;
import java.util.Scanner;

public class M1_Act1 {

	public static void main(String[] args) {
		// Create a Scanner object
				Scanner input = new Scanner(System.in);
				
				// Read user input
				System.out.print("What is your name? ");
				String inpName = input.nextLine();
				
				//Display output 
				System.out.print("Hello, " + inpName + "!" );


	}

}
