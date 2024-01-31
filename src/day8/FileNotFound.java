package day8;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {
    public static void main(String[] args) {
            ReadFile("example.txt");
    }
    private static void ReadFile(String name_file)
    {

        try {
            FileReader read = new FileReader(name_file);
        } catch (FileNotFoundException e)
        {
            System.out.println("File not found\nsystem message: "+e.getMessage());
        }

    }
}
