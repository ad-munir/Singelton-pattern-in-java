package Singelton;

public class ThreadSafeSingelton {

    private static ThreadSafeSingelton instance;
    private ThreadSafeSingelton() {}

    public static synchronized ThreadSafeSingelton getInstance(){
        if(instance == null)
            synchronized (ThreadSafeSingelton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingelton();
                }
            }
        return instance;
    }
}
