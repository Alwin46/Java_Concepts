import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;


public class file_Reading
{
    public static void main(String[] args) throws IOException
    {
        FileReader reader=new FileReader("text.txt");
        BufferedReader reader1=new BufferedReader(reader);
        Iterator iterator=reader1.lines().iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
