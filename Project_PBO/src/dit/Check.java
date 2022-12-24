package dit;

public class Check implements PC{
    private boolean ispowerOn;

    void turnOnThePc(){
        this.powerOn();
    }
    void turnOffThePc(){
        this.powerOff();
    }
    public void powerOn(){
        ispowerOn = true;
        System.out.println("Welcome to Supiyo NET");
        System.out.println("Have Fun Guys!!!");
    }


    @Override
    public void printUser() {
        System.out.println("Anda masuk sebagai admin..");
    }


    public void powerOff(){
        ispowerOn = false;
    }
}
