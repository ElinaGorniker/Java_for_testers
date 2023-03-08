package JavaOOP;

public class InterfaceDemo implements A, B {


    @Override
    public void printMessage() {
        System.out.println("Implemented A");
    }

@Override
    public void printNewMessage() {
    System.out.println("Implemented B");
}

}
