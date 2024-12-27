import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Exception;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {

        // way1
        try(FileReader reader=new FileReader("ex1.txt")){
            int cha;
            while((cha=reader.read())!=-1){
                System.out.print((char)cha);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        //way2
        try(FileInputStream read=new FileInputStream("ex1.txt")){
            int byteValue;
            while ((byteValue=read.read())!=-1){
                System.out.print((char)byteValue);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        //way3
        try{
            for (String readAllLine : Files.readAllLines(Paths.get("exp.txt"))) {
                System.out.println(readAllLine);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
