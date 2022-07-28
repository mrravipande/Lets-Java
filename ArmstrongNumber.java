import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, arm=0, rem, copy;

        System.out.print("Enter Number: ");
        num = sc.nextInt();

        copy=num;

        while(num>0) {
            rem = num % 10;
            arm = (rem * rem * rem)+arm;
            num = num / 10;
        }

        if(copy==arm) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
