package study.constructor;

public abstract class Parent {

    protected String sthStr;

    public Parent(int number) {
    }

    public void method1() {
        System.out.println("메서드 원");
    }

    abstract public void parse (int number);

    public String getSthStr() {
        return sthStr;
    }
}
