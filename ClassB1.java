import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ClassB1 {
    static Scanner sc = new Scanner(System.in);
    synchronized public static void main(String[] args) {
        ClassA1 a1obj = new ClassA1();
        new Thread(){
            public void run(){
                try{
                    a1obj.withdraw();
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread(){
            public void run(){
                a1obj.deposit();
            }
        }.start();
    }
}
