import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.Exception;

public class Filehandling {

    public static void main(String[] args) {

        try {
            File file = new File("D://fani.txt");
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("i am execute everytime");
        }
    }
}
