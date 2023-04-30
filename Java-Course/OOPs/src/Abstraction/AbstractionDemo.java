package Abstraction;

import java.util.ArrayList;

interface Mobile {
    public void calling(String number);
    public void sendMsg(String message);
}

class Android implements Mobile {
    private ArrayList<String> contacts = new ArrayList<String>();

    public void addContacts(String number) {
        contacts.add(number);
    }
    @Override
    public void calling(String number) {
        System.out.println("Calling ..."+number);
    }

    @Override
    public void sendMsg(String message) {
        System.out.println("Sending message from interface..."+message);

    }
}

abstract class AbsMobile {
    ArrayList<String> list = new ArrayList<String>();
    abstract void calling(String number);
    abstract void sendMsg(String message);
    public void addContact(String contact) {
        list.add(contact);
    }
}

class AbsAndroid extends AbsMobile {

    @Override
    void calling(String number) {
        System.out.println("Calling..."+number);
    }

    @Override
    void sendMsg(String message) {
        System.out.println("Sending message from Abstract class...."+message);
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Android myPhn = new Android();
        myPhn.calling("0123456789");
        myPhn.sendMsg("Hello Everyone");
        myPhn.addContacts("0123456789");

        AbsAndroid myAbsPhn = new AbsAndroid();
        myAbsPhn.addContact("1234567890");
        myAbsPhn.calling("1234567890");
        myAbsPhn.sendMsg("Hello Everyone (Abstract class)");
    }
}
