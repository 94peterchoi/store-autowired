package study.constructor;

public class ConstructorEx extends Parent{

    public ConstructorEx(int number) {
        super(number);
        parse(number);
    }

    @Override
    public void parse(int number) {
        this.sthStr = new String(number + "");
    }
}
