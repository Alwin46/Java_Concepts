import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class file_Writer
{
    public static void main(String[] args) throws IOException
    {
        //This is one way

       /* FileWriter writer=new FileWriter("text1.txt");
        writer.write("i am alwin");
        writer.close();*/

        FileWriter writer1=new FileWriter("text2.txt");
        BufferedWriter writer2=new BufferedWriter(writer1);
        writer2.write("hello ,I am alwin ,I hope you are doing great");
        writer2.close();
         /*
          This is also file writing method and this is another way and this type of file writer is used with
          bufferWriter it is most efficient than file writer
          */
    }
}
