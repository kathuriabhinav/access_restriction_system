package accessrestrictionsystem;

import java.sql.*;
import java.util.Calendar;

public class compare_two_times 
{
    static Calendar cal = Calendar.getInstance();
    static int hour = cal.get(Calendar.HOUR_OF_DAY);
    static int min = cal.get(Calendar.MINUTE);
    static int day = cal.get(Calendar.DAY_OF_WEEK);
    static String e;
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/accessrestrictionsystem";
    static final String USER = "root";
    static final String PASS = "root";


    public compare_two_times(String emailid)
    {
        e=emailid;
    }
    public static int main(String[] s) 
    {
            int hey=0,t = 0;
            Connection conn = null;
            PreparedStatement stmt = null;
            try
            {    
                Class.forName(JDBC_DRIVER).newInstance();
                conn = DriverManager.getConnection(DB_URL,USER, PASS);
                stmt = conn.prepareStatement("SELECT timings FROM user1 WHERE email_id=?");
                stmt.setString(1,e);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) 
                {
                        t = rs.getInt("timings");
                }
                if(t==1)
                {
                    hey=1; 
                }else if(t==2)
                {
                    if(hour<22) {
                        if(hour>=8) {
                                hey=1;
                        }
                    }
                }else if(t==3)
                {
                    if(day<7) {
                        if(day>1) {
                                if(hour<22) {
                                        if(hour>=8) {
                                                hey=1;
                                        }
                                    }
                        }
                    }
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
