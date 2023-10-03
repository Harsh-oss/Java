import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//DataStream
public class DataStream {
    static void writeData() throws Exception{
        //writing datatype into file
        System.out.println("Writing Datatype");
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\data.txt"));

        dos.writeInt(1000);
        dos.writeChar('A');
        dos.writeBoolean(true);
        dos.writeInt(123456);

        System.out.println("Done writing");
        dos.close();
    }
    static void readData() throws Exception{
        //Reading datatype from file
        DataInputStream dis = new DataInputStream(new FileInputStream("D:\\data.ser"));
        System.out.println("Reading datatype");
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readInt());
        System.out.println("Done");
        dis.close();
    }

    public static void main(String[] args) throws Exception {
        writeData();
        readData();
    }
}
