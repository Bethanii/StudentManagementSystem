/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author hambetn
 */
public class StudentDB {
   //constraints
  private final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/cis355a";
  private final String USER_NAME = "root";
  private final String PASSWORD = "devry123";
  
  public void add( Student stu ) throws ClassNotFoundException, SQLException{
    
         //Chekc for the driver
      Class.forName("com.mysql.cj.jdbc.Driver");
      
      //connect to the database
      Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
      
      //write the student record to the database
      String sqlStr = "INSERT INTO students (StudentName, Test1, Test2, Test3) VALUES(?, ?, ?, ?)";
      PreparedStatement psmt = conn.prepareStatement(sqlStr);
      psmt.setString(1, stu.getName());
      psmt.setDouble(2, stu.getTest1());
      psmt.setDouble(3, stu.getTest2());
      psmt.setDouble(4, stu.getTest3());
      
      psmt.execute();
      
      //close the connection
      conn.close();
     }
  public ArrayList<Student> getAll() throws ClassNotFoundException, SQLException{
      //create an empty array list
      ArrayList<Student> list = new ArrayList<Student>();
      
      //check for the driver
      Class. forName("com.mysql.cj.jdbc.Driver");
      
      //conect to database
      Connection conn = DriverManager.getConnection(CONNECTION_STRING, USER_NAME, PASSWORD);
      
      //get records from database
      String strSQL = "SELECT * FROM students";
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(strSQL);
      
      while (rs.next())
      {
          int stuID = rs.getInt(1);
          String name = rs.getString(2);
          var test1 = rs.getDouble(3);
          double test2 = rs.getDouble(4);
          double test3 = rs.getDouble(5);
          
          Student stu = new Student(stuID, name, test1, test2, test3);
          
          list.add(stu);
      } 
      conn.close();
              
      return list;       
  }
  }

