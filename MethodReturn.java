import java.util.Scanner;

public class MethodReturn {
    public static void main(String[] args) {

        int ans = sumReturn();
        System.out.println("Your ans is: "+ans);
    }
    static int sumReturn() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        return sum;
    }
}
