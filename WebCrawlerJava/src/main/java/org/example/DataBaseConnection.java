package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    static Connection connection=null;
    public static Connection getConnection(){
        if(connection!=null)return connection;

        String user="root";
        String pswd="Shivam@123";
        String db= "searchengine";
        return getConnection(user,pswd,db);

    }

    private static Connection getConnection(String user, String pswd, String db){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost/"+db+"?user="+user+"&password="+pswd);
        }
        catch (SQLException | ClassNotFoundException sqlException){
            sqlException.printStackTrace();
        }
        return  connection;
    }
}
