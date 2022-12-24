package yan;

import dit.PC;

public abstract class Abs implements PC {
    private String name;

    public Abs(String name){
        this.name = name;
    }
    abstract void display();
}
