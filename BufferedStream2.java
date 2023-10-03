import java.io.*;

//BufferedCharacterStream
public class BufferedStream2 {

    static void readFile() throws Exception{
        //Reading file using BufferedCharacterStream
        BufferedReader br = new BufferedReader(new FileReader("D:\\filecreated.txt"));
        int x;
        while ((x= br.read())!=-1){
            System.out.print((char) x);
        }
        System.out.println("Done");
        br.close();
    }

    static void writeFile() throws Exception{
        //Writing into file using BufferedCharacterStream
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\filecreated.txt"));
        String s = " 9·11·2023\n" +
                "A good plan violently executed now is better than a perfect plan executed next week.\n" +
                "George PattonWriting Done";
        bw.write(s);
        bw.close();
    }

    public static void main(String[] args) throws Exception{

        writeFile();
        readFile();
    }
}
