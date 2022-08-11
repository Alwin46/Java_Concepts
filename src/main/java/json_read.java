 import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class json_read
{
    public static void main(String[] args) throws IOException, ParseException
    {
        JSONParser parser=new JSONParser();
        FileReader reader=new FileReader("Json_File.json");

        Object object=parser.parse(reader);
        JSONObject object1= (JSONObject) object;

         Long age= (Long) object1.get("age");
         String name= (String) object1.get("name");

         JSONArray array= (JSONArray) ((JSONObject) object).get("array");
        Iterator iterator=array.iterator();

        System.out.println("age :"+age);
        System.out.println("name :"+name);

        while (iterator.hasNext())
        {
            System.out.println("array :"+iterator.next());
        }

    }
}
