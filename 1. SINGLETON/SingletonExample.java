public class SingletonExample {
    public static void main(String[] args) {

        //Anonymous Class by which we can use interfaces
        //Runnable is an interface
        //It is called Functional Interface
        // The interface which has only one abstract method i.e called Functional Interface
        //Runnable has one abstract method run()
        //but we don't need to override it
        //The below syntax automatically overrides it.
        Runnable task = () -> {
            Singleton obj = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " -> " + obj);
        };

        //another syntax to write Anonymous class
        //if we to override run then this is the syntax
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                Singleton obj = Singleton.getInstance();
                System.out.println(Thread.currentThread().getName() + " -> " + obj);
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task2, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
