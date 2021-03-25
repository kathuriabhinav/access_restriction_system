package oom_group_15;

import java.sql.*;
public class do_access_change {
	do_access_change(int i,String emailid) 
	{
	    String DB_URL = "jdbc:derby:database";

	    Connection conn = null;
	    PreparedStatement stmt = null;
	    try
	    {
        	Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
	         conn = DriverManager.getConnection(DB_URL);
	         stmt = conn.prepareStatement("UPDATE user1 SET inside = ? WHERE email_id = ?");
	         stmt.setInt(1,i);
	         stmt.setString(2,emailid);
                 System.out.println("the state of " + emailid + " whether in or out is updated sucecessfully");
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
	}
}
