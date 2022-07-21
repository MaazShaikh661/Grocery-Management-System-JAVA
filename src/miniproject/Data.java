package miniproject;
import java.sql.*;
public class Data 
{
    public static void add(int id,String name, String company, int quantity, int price)
    {
        String sql;
        Connection con = null;
        Statement stmt = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minii","root","#Maaz5770");
            stmt=con.createStatement();
            stmt.executeUpdate("insert into grocery values ('"+id+"','"+name+"','"+company+"',"+quantity+","+price+");");          
            }
        catch(ClassNotFoundException | SQLException e){System.out.println(e);}
        System.out.println("insert into grocery values ('"+id+"','"+name+"','"+company+"',"+quantity+","+price+");");
    }
    public static void modify(int id, int quantity)
    {
        if(check(id))
        {
        String sql;
        Connection con = null;
        Statement stmt = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minii","root","#Maaz5770");
            stmt=con.createStatement();
            stmt.executeUpdate("update grocery set quantity="+quantity+" where grocery_id='"+id+"';");          
            }
        catch(ClassNotFoundException | SQLException e){System.out.println(e);}
        System.out.println("update grocery set quantity="+quantity+" where grocery_id='"+id+"';");
        }
    }
    public static void delete(int id)
    {
        if(check(id))
        {
            String sql;
        Connection con = null;
        Statement stmt = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minii","root","#Maaz5770");
            stmt=con.createStatement();
            stmt.executeUpdate("delete from grocery where grocery_id='"+id+"';");          
            }
        catch(ClassNotFoundException | SQLException e){System.out.println(e);}
        System.out.println("delete from grocery where grocery_id='"+id+"';");
        }
    }
    public static boolean check(int id)
    {
        Connection con = null;
        Statement stmt = null;
        int ctr=0;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/minii","root","#Maaz5770");
             stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from grocery;");
            while(rs.next())
                if(Integer.parseInt(rs.getString(1))==id )
                    ctr++;
            if(ctr!=0)
                return true;
            else
                return false;
        }
        catch(ClassNotFoundException | SQLException e){}
        return false;
    }
}
