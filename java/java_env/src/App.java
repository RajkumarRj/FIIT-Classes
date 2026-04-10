public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String password = System.getenv("my_password");
        System.out.println(password);
    }
}
