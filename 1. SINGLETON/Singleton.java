public class Singleton {
    private static Singleton instance;
    private Singleton(){}

    //expensive operation if we use synchronized
    // LOCK -> CHECK -> RETURN -> UNLOCK
//    public static synchronized Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//        return instance;
//    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
