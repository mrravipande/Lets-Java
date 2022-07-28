import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum=0, copy, rem;

        System.out.print("Enter number:");
        num = sc.nextInt();

        copy = num;
        while(num>0) {
            rem = num % 10;
            sum = (sum*10)+rem;
            num = num/10;
        }

        if (copy==sum) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Palindrome not");
        }

    }
}
