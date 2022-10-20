package study.constructor;

public class App {
    public static void main(String[] args) {
        Parent processor = new ConstructorEx(17);

        System.out.println(processor.getSthStr());
    }
}
