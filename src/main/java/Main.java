import Singelton.EagerSingelton;

public class Main {
    public static void main(String[] args) {

        EagerSingelton obj1 = EagerSingelton.getInstance();
        EagerSingelton obj2 = EagerSingelton.getInstance();

        System.out.println(obj1 == obj2);
    }
}