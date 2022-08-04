public class FunctionReturn {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println("Your ans is = "+ans);
    }

    static int sum() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        return sum;
    }
}
