 import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class json_Write
{
    public static void main(String[] args) throws IOException
    {
        JSONObject object=new JSONObject();
         object.put("age",20);
         object.put("name","Alwin");

        JSONArray array=new JSONArray();
        array.add("ZX10R");
        array.add("S1000R");
        array.add("V4R");
        object.put("array",array);

        FileWriter writer=new FileWriter("Json_File.json");
        BufferedWriter writer1=new BufferedWriter(writer);
        writer1.write(object.toString());
        writer1.close();
    }
}
