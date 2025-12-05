package M1_Activity5;
import java.util.Scanner;

public class Activity5 {
	//Method to get sum of 1 to 50
			public static void getSumofN() {
				int sum=0;
				
				for  (int x = 1; x <= 50; x++)
				{
					 sum += x;
				}
				System.out.print("Sum is: " + sum);
			}
	public static void main(String[] args) {
		
			//Call Method to display sumOfN
			getSumofN();

	}

}
