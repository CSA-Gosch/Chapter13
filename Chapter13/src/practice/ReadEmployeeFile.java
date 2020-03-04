package practice;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.*;

public class ReadEmployeeFile {

    public static void main(String[] args)
    {
        Path file = Paths.get("C:\\Users\\lg154842\\Desktop\\Chapter13\\src\\practice\\Employees.txt");
        String s = "";

        try
        {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            s = reader.readLine();
            while (s != null){
                System.out.println(s);
                s = reader.readLine();
            }
        }
        catch(Exception e){
            System.out.println("Message: " + e);
        }
    }

}
