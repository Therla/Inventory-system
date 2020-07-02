package com.connection;
import java.sql.*;
public class DatabaseConnection {
private static final String cond="com.mysql.jdbc.Driver";
private static final String conc="jdbc:mysql://localhost:3306/smdatabase?characterEncoding=utf-8";
private static final String username="root";
private static final String password="123456";
private Connection conn=null;

public DatabaseConnection() throws Exception
{
Class.forName(cond);
conn=DriverManager.getConnection(conc,username,password);
}

public Connection getConnection()
{
return conn;	
}

public void close() throws SQLException
{
conn.close();	
}
}
