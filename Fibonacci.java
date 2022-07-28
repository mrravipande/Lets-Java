import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int term;
        float a=0, b=1, c;
        System.out.print("Enter a term: ");
        term = sc.nextInt();

        for(int i=1; i<term; i++)
        {
            System.out.print(a+" ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
