package Singelton;

public class EagerSingelton {

    // Eagerly creating the instance at class loading time
    private static final EagerSingelton instance = new EagerSingelton();

    // private constructor to avoid client applications using the constructor
    private EagerSingelton() {}

    public static EagerSingelton getInstance(){
        return instance;
    }
}
