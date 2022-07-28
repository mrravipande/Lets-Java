import java.util.Scanner;

public class MethodSum2 {
    public static void main(String[] args) {

        sum();
    }
    static void sum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        int sum = 0;
        sum = num1 + num2;

        System.out.println("Sum of = "+sum);
    }
}
