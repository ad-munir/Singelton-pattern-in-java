package Singelton;

public class StaticBlockSingelton {

    private static StaticBlockSingelton instance;


    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingelton();

        }catch (Exception ex){
            throw new RuntimeException("Exception occurred while creating the instance");
        }
    }

    // private constructor to avoid client applications using the constructor
    private StaticBlockSingelton() {}

    public static StaticBlockSingelton getInstance(){
        return instance;
    }
}
