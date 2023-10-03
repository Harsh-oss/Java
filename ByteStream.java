import java.io.FileInputStream;
import java.io.FileOutputStream;
//ByteStream
public class ByteStream {
    //Writing data into a file
    void writeFile() throws Exception{
        System.out.println("Writing data into file");
        FileOutputStream fos = new FileOutputStream("D:\\file1.txt");
        String msg = "Man cannot discover new oceans unless he has the courage to lose sight of the shore. ";
        byte[] arr = msg.getBytes();
        fos.write(arr);
        System.out.println("Writing data into file Completed");
        fos.close();
    }
    //Reading data from a file
    void readFile() throws Exception{
        System.out.println("Reading data from file");
        System.out.print("==>");
        FileInputStream fis = new FileInputStream("D:\\file1.txt");
        int x;
        while((x=fis.read())!=-1){
            System.out.print((char)x);
        }
        System.out.println("Reading data from file done");
        fis.close();
    }
    //Copying data from a file into another file
    void copyFile() throws Exception{
        System.out.println("Copying file");
        FileInputStream fis = new FileInputStream("C:\\Users\\Harsh Patidar\\OneDrive\\Desktop\\flowers-8184126_1280.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Harsh Patidar\\OneDrive\\Desktop\\copy.jpg");
        int x;
        while ((x=fis.read())!=-1){
            fos.write(x);
        }
        System.out.println("Copying done");
        fis.close();
        fos.close();
    }

    public static void main(String[] args) throws Exception{
        ByteStream fo = new ByteStream();
        fo.readFile();
        fo.writeFile();
        fo.copyFile();
    }
}
