import java.io.Serializable;

public class ClassA implements Runnable, Serializable {
    int a = 10;
    int b = 20;

    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("ClassA thread "+ i);
        }
    }


}