import java.io.*;
//CharacterStream
public class CharacterStream {
    void readFile() throws Exception{
        System.out.println("Reading data...");
        FileReader fr = new FileReader("D:\\file1.txt");
        int x;
        while((x=fr.read())!=-1){
            System.out.print((char) x);
        }
        fr.close();
        System.out.println("Done");
    }
    void writeFile() throws Exception{
        System.out.println("Writing...");
        FileWriter fw= new FileWriter("D:\\file2.txt");
        String msg = "The isn't who is going to let me. It's who is going to stop me.\n";
        fw.write(msg);
        fw.close();
        System.out.println("Done");
    }
    void copyFile() throws Exception{
        System.out.println("Copying...");
        FileReader fr = new FileReader("D:\\Tom.Clancys.Jack.Ryan.S04.COMPLETE.720p.AMZN.WEBRip.x264-GalaxyTV[TGx]\\Tom.Clancys.Jack.Ryan.S04E01.720p.AMZN.WEBRip.x264-GalaxyTV.mkv");
        FileWriter fw = new FileWriter("D:\\file2.mkv");
        int x;
        while ((x=fr.read())!=-1){
            fw.write(x);
        }
        System.out.println("Done");
        fr.close();
        fw.close();
    }

    public static void main(String[] args) throws Exception {
        CharacterStream obj = new CharacterStream();
//        obj.readFile();
//        obj.writeFile();
        obj.copyFile();
    }
}
