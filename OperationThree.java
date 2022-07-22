import java.util.Scanner;

public class OperationThree
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 Numbers:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int sum = num1 + num2;
		System.out.println("Sum is: "+sum);

		int sub = num1 - num2;
		System.out.println("Subtraction is: "+sub);

		int multi = num1 * num2;
		System.out.println("Multiplication is: "+multi);

		int div = num1 / num2;
		System.out.println("Division is: "+div);
	}
}
