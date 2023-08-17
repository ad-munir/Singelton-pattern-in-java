package Singelton;

public class ThreadSafeSingelton {

    private static ThreadSafeSingelton instance;
    private ThreadSafeSingelton() {}



    // Global point of access to the instance
    public static synchronized ThreadSafeSingelton getInstance(){
        if(instance == null)

            // Synchronize on the class to ensure thread safety during instance creation
            synchronized (ThreadSafeSingelton.class) {

                // Check again within the synchronized block to prevent race conditions
                if (instance == null) {
                    // Create the instance only if it still hasn't been created
                    instance = new ThreadSafeSingelton();
                }
            }
        return instance;
    }
}
