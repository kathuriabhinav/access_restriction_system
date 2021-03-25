package oom_group_15;
import java.sql.*;
public class login{
	static String emailid;
	static String pass;
	login(String e, String p){
		emailid=e;
		pass=p;
	}
	static String DB_URL = "jdbc:derby:database";
    public static int main(String[] s) {
		
		int hey=0;
		Connection conn = null;
		PreparedStatement stmt = null;
		try
		{    
        	Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
			conn = DriverManager.getConnection(DB_URL);
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