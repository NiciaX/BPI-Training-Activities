package M1_Act2;
import java.util.Scanner;

public class M1_Activity3 {

	public static int getSum(int a, int b) {
        return a + b;
    }
	
	public static int getDifference(int a, int b) {
        return a - b;
    }
	
	public static int getProduct(int a, int b) {
        return a * b;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);	
		
		int first=0;
		int second=0;
	
		System.out.print("Enter first number: ");
		first = input.nextInt();
	
		System.out.print("Enter second number: ");
		second = input.nextInt();
	
		int sum = getSum(first, second);
        	int diff = getDifference(first, second);
        	int prod = getProduct(first, second);

	
		System.out.println("Sum: "+sum);
		System.out.println("Difference: "+diff);
		System.out.print("Product: "+prod);
	}

}
