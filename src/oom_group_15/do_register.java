package oom_group_15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;


public class do_register {
	static String n,e,c,p;
    static int m;
    public do_register(String name,String password,String email,String contact_no,int mode) 
    {
        n=name;e=email;c=contact_no;p=password;m=mode;
    }
    static String DB_URL = "jdbc:derby:database";
    public static int main(String[] args)
    {
        int hey = 0;
        Connection conn = null;
        PreparedStatement stmt = null;
        try
        {
        	Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
	         conn = DriverManager.getConnection(DB_URL);
	         stmt = conn.prepareStatement("INSERT INTO user1 VALUES(?,?,?,?,?,?)");
	         stmt.setString(1,e);
	         stmt.setString(2,p);
	         stmt.setString(3,n);
	         stmt.setString(4,c);
	         stmt.setInt(5,m);
	         stmt.setInt(6,0);
	         stmt.executeUpdate();
	         
	         new JavaMail(e,n,m);
	         JavaMail.main(new String[0]);
        
        }
        
        catch (SQLIntegrityConstraintViolationException se)
        {
        	hey=1;
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
                {
                	conn.close();
                }
            }
            catch(SQLException se)
            {
            	se.printStackTrace();
            }
            finally {
            	try
                {
                    if(conn!=null)
                    {
                    	conn.close();
                    }
                    
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
