package com.arindam;
import java.sql.*;
class TestConnection
{
	private Connection cn=null;
	private Statement  st=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String select_sql="select * from customer";
	private String insert_sql="insert into customer values(?,?,?)";
	private String delete_sql="delete from customer where cid=?";
	private String update_sql="update customer set cname=?,cphno=? where cid=?";

	public void getData()
	{
		try
		{
		//Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		//cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testingdbs","root","arindam");//ESTABLISH CONNECTION
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
		st=cn.createStatement();//CREATING THE STATEMENT
		rs=st.executeQuery(select_sql);//execute the query and store data into resultset
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"===>"+rs.getString(2)+"====>"+rs.getString(3));
			//System.out.println(rs.getString(2));
			//System.out.println(rs.getString(3));
		}
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void insertData()
	{
		try
		{
		//Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		//cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testingdbs","root","arindam");//ESTABLISH CONNECTION
			ConnectionFactory con=new ConnectionFactory();
			cn=con.getConn();
		ps=cn.prepareStatement(insert_sql);
		ps.setString(1,"C3");
		ps.setString(2,"AYAN");
		ps.setString(3,"233445");
		ps.executeUpdate();//SAVING DATA
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void updateData()
	{
		try
		{
		//Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		//cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testingdbs","root","arindam");//ESTABLISH CONNECTION
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
		ps=cn.prepareStatement(update_sql);
		ps.setString(3,"C2");
		ps.setString(1,"JAYANTA");
		ps.setString(2,"656556");
		ps.executeUpdate();//SAVING DATA
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void deleteData()
	{
		try
		{
		//Class.forName("com.mysql.cj.jdbc.Driver");//REGISTER AND LOAD THE JDBC DRIVER
		//cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/testingdbs","root","arindam");//ESTABLISH CONNECTION
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
		ps=cn.prepareStatement(delete_sql);
		ps.setString(1,"C3");
		ps.executeUpdate();//SAVING DATA
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
public class JavaMySqlConn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  TestConnection ts=new TestConnection();
  //ts.insertData();
 // ts.deleteData();
  //ts.updateData();
  ts.getData();
	}

}
