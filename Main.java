public class Main {
    public void hello(){
        for (int i = 0; i < 1000000; i++) {
            System.out.println("Hello World!");
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello World!"+ args[0] + " "+ args[1]);
    }
}

