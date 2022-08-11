import java.sql.*;

public class dataBase
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://root@localhost/demodatabase");
        Statement statement=connection.createStatement();
        ResultSet set=statement.executeQuery("Select * From `name`");
        while (set.next())
        {
            System.out.println("first_name :"+set.getString(1)+"  "+ "last_name :"+set.getString(2));
        }
    }
}
