package anujkesarwani.assignment.singleton;

public class SingletonClass {
    String myStr;
    public static SingletonClass initialize(String str, SingletonClass singleton) {
        if(singleton instanceof SingletonClass) {
            singleton.myStr = str;
            return singleton;
        }
        SingletonClass singleton1 = new SingletonClass();
        singleton1.myStr = str;
        return singleton1;
    }
    public void printString() {
        System.out.println("myString: " + myStr);
    }
}

