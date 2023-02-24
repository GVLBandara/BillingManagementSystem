/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;
/**
 *
 * @author Gota
 */
public class DBConnection {
    private static DBConnection dbConnection;
    private final Connection connection;
    
    private DBConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/bms", "root", "");
        }
        catch(ClassNotFoundException | SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public static DBConnection getDBConnection(){
        return (dbConnection == null) ? dbConnection = new DBConnection() : dbConnection;
    }
    
    public Connection getConnection(){
        return connection;
    }
    
}
