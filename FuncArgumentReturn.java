public class FuncArgumReturn {
    public static void main(String[] args) {
        String greet = msg("Ravi");
        System.out.println(greet);
    }
    static String msg(String name) {
        String message = "Hello "+name+" Sir,";
        return message;
    }
}
