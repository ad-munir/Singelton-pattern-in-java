package Singelton;

public class LazySingelton {

    private static LazySingelton instance;
    private LazySingelton() {}

    public static LazySingelton getInstance(){
        if(instance == null)
            instance = new LazySingelton();
        return instance;
    }
}
