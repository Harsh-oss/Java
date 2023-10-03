import java.io.Serializable;

public class ClassB implements Serializable, Runnable{
    int a = 100;
    int b = 200;
    public void run(){
        resource();
    }
    void resource(){
        String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();


         synchronized (this){
             for (int i = 1; i <= 5; i++) {
                 System.out.println(name + "( "+ priority+" ) "+ i);
             }
         }
        for (int i = 1; i <= 5; i++) {
            System.out.println("second "+name + "( "+ priority+" ) "+ i);
        }


    }
    public static void main(String[] args) throws InterruptedException {
        ClassB bobj = new ClassB();
        Thread t1 = new Thread(bobj);
        Thread t2 = new Thread(bobj);

        t1.setName("First");
        t2.setName("Second");

//        t1.setPriority(MAX_PRIORITY);
//        t2.setPriority(MIN_PRIORITY);

        t1.start();
//        t2.start();
    }
}