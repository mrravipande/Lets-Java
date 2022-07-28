import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Electricity Units: ");
        int unit = sc.nextInt();

        int bill = unit * 9;

        System.out.println("Your Electricity Bill = "+bill);
    }
}
