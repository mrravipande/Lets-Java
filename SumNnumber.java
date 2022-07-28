import java.util.Scanner;

public class SumNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting Number: ");
        int start = sc.nextInt();
        System.out.print("Enter Ending Number: ");
        int end = sc.nextInt();

        int sum=0;
        while(start<=end) {
            System.out.println(start);
            sum = start+sum;
            start++;
        }

        System.out.println("Sum = "+sum);
    }
}
