package oom_group_15;

import java.sql.*;
public class do_update {
	static String e,c,p;
    static int m;
    public do_update(String emailid, String password,String contact_no,int mode) 
    {
        e=emailid;c=contact_no;p=password;m=mode;
    }
    static String DB_URL = "jdbc:derby:database"; 
    public static void main(String[] args)
    {
        Connection conn = null;
        PreparedStatement stmt = null;
        try
        {
        	Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
	         conn = DriverManager.getConnection(DB_URL);
	         stmt = conn.prepareStatement("UPDATE user1 SET person_id = ?, contact_no = ? , timings = ? WHERE email_id = ?");
	         stmt.setString(1,p);
	         stmt.setString(2,c);
	         stmt.setInt(3,m);
	         stmt.setString(4,e);
	         stmt.executeUpdate();
                 System.out.println("entered details of " + e + " updated successfully");
	         
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
