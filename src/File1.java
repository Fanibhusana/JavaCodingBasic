import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class File1 {
    public static void main(String[] args) throws IOException {
        // way 1
        File file = new File("exp.txt");
        if(file.createNewFile()){
            System.out.println("file created successfully");
        }
        else System.out.println("file already exit");
            FileWriter writer = new FileWriter(file);
            writer.write("i am Fanibhusana maharana from india \n currently in bengaluru");
            System.out.println("written to the file");
            writer.close();

            // way 2
            try(FileOutputStream stream = new FileOutputStream("EXP1.txt");){
            System.out.println("file created successfully");
            stream.write("i dont know u but do u know me".getBytes());
            System.out.println("written to the file");
            stream.close();
        }catch (IOException e){
            System.out.println(e);
        }

            //way 3
     try{
            Files.write(Paths.get("ex1.txt"),"Fanibhusana Maharana".getBytes());
        }catch (IOException e){
         System.out.println(e);
     }
    }
}
