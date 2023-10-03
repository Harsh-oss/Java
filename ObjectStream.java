import java.io.*;

public class ObjectStream {
    //Copying Object into file with input and output stream
    static void copyingObject() throws Exception{
        ClassA aobj = new ClassA();
        ClassB bobj = new ClassB();
        System.out.println(aobj.a+" "+ aobj.b);
        System.out.println(bobj.a+" "+ bobj.b);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\data.txt"));
        oos.writeObject(aobj);
        oos.writeObject(bobj);
        oos.close();
        System.out.println();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\data.txt"));
        ClassA aobj2 = (ClassA) ois.readObject();
        ClassB bobj2 = (ClassB) ois.readObject();
        System.out.println(aobj2.a+" "+ aobj2.b);
        System.out.println(bobj2.a+" "+ bobj2.b);
        System.out.println("Done ");
        ois.close();
    }

    public static void main(String[] args) throws Exception {
        copyingObject();
    }
}
