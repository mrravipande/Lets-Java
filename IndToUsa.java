import java.util.Scanner;

public class IndToUsa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Rupees: ");
		int ind = sc.nextInt();

		float usd = ind / 79.80f;

		System.out.println("Amount is: "+usd+"$");

	}
}
