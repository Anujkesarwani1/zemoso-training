package basicstrongOOP;
class Fan {
    public boolean isOn;
    public static int staticVar;

    Fan(boolean a) {
        this.isOn = a;
    }
    public void turnOn() {
        isOn = true;
        int var = 1;
        System.out.println("Fan is start");
    }
    public void turnOff() {
        isOn = false;
        System.out.println("Fan is stop");
    }
}

public class Demo {
    public static void main(String[] args) {
        Fan myFan = new Fan(true);
        myFan.turnOn();
        myFan.turnOff();
        Fan.staticVar = 5;
        Fan favFan = new Fan(true);
        favFan.isOn = true;
        System.out.println(Fan.staticVar);
        System.out.println(favFan.isOn);

        Addition a1 = new Addition();
        System.out.println(a1.findSum(5, 7));

        System.out.println(Addition.getVal());
    }
}

class Addition {

    public static int val = 10;
    public int publicVal = 5;
    public int findSum(int a, int b) {
        return (a + b);
    }

    public static int getVal() {
        return val;
    }
}
