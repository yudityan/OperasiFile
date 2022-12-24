package yan;

public class TestAbs extends Abs{
    public TestAbs(String name){
        super(name);
    }

    @Override
    void display() {
        System.out.println("Menu Warnet DITYAN");
    }

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }

    @Override
    public void printUser() {
        System.out.println("test");
    }
}
