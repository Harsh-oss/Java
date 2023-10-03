import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;

//BufferedByteStream
public class BufferedStream1 {
    static void readFile() throws Exception{
        System.out.println("Reading......");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\filecreated.txt"));
        int x;
        while ((x=bis.read())!=-1){
            System.out.print((char)x);
        }
        System.out.println("\n DONE");
        bis.close();
    }

    static void writeFile() throws Exception{
        System.out.println("Writing........");
        String s ="A good plan violently executed now is better than a perfect plan executed next week. George Patton";
        BufferedOutputStream bod = new BufferedOutputStream(new FileOutputStream("D:\\filecreated.txt"));
        byte[] b = s.getBytes();
        bod.write(b);
        System.out.println("Done");
        bod.close();
    }

    static void copyFile() throws Exception{
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Tom.Clancys.Jack.Ryan.S04.COMPLETE.720p.AMZN.WEBRip.x264-GalaxyTV[TGx]\\Tom.Clancys.Jack.Ryan.S04E01.720p.AMZN.WEBRip.x264-GalaxyTV.mkv"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\copyJackRyan.mkv"));
        int x;
        while ((x=bis.read())!=-1){
            bos.write(x);
        }
        System.out.println("Done");
        bis.close();
        bos.close();
    }
    public static void main(String[] args) throws Exception{
//        writeFile();
//        readFile();
//        copyFile();
    }

    public static class Dummy {
        public static void jButton(java.awt.event.ActionEvent evt){

        }

        public static void main(String[] args) {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "user1", "user1");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select * from emp");
                ResultSetMetaData rm = rs.getMetaData();
                while (rs.next()){
                    if (rs.getString("ename").equals("ALLEN")){
                        for (int i = 0; i < rm.getColumnCount(); i++) {
                            System.out.print(rs.getString(i)+"\t");
                        }
                        System.out.println();
                    }
                }
            }  catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
