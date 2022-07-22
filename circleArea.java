import java.util.Scanner;

class circleArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Radius of circle: ");
		float rad = sc.nextFloat();

		float area = 3.14f * rad * rad;

		System.out.printf("Area of circle: %f",area);
	}
}
