import java.util.Scanner;

public class SimpleInterest
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Principal amount:");
		float principal = sc.nextFloat();

		System.out.println("Time of year:");
		float time = sc.nextFloat();

		System.out.println("Rate of Interest:");
		float rate = sc.nextFloat();

		float SI = principal * time * rate;

		System.out.println("Simple Interest is: "+SI);
	}
}
