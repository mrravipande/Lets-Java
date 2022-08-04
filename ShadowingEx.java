public class ShadowingEx {
    static int a = 0;
    public static void main(String[] args) {
        a = 10;

        int b = 10;
        {
            b = 20;
            a = 100;
        }

        System.out.println(b);
        System.out.println(a);
    }
}
