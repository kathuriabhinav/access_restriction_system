package accessrestrictionsystem;
import java.sql.*;
public class login_check{
    static String emailid;
    static String pass;
    login_check(String e, String p){
            emailid=e;
            pass=p;
    }
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/accessrestrictionsystem";
    static final String USER = "root";
    static final String PASS = "root";
    public static int main(String[] s) 
    {
        int hey=0;
        Connection conn = null;
        PreparedStatement stmt = null;
        try
        {    
        Class.forName(JDBC_DRIVER).newInstance();
                conn = DriverManager.getConnection(DB_URL,USER, PASS);
                stmt = conn.prepareStatement("SELECT email_id,person_id FROM user1 WHERE email_id=? and person_id=?");
                stmt.setString(1,emailid);
                stmt.setString(2,pass);
                ResultSet rs = stmt.executeQuery();
                if(rs.next())
                {
                    hey=1; 
                    System.out.println("login of " + emailid + " successfull");
                }
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if(stmt!=null)
                conn.close();
            }
            catch(SQLException se)
            {
                se.printStackTrace();
            }
            finally 
            {
                try
                    {
                        if(conn!=null)
                        conn.close();
                    }
                    catch(SQLException se)
                    {
                        se.printStackTrace();
                    }
            }
        }
        return hey;
    }
}