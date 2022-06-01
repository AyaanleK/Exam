package com.koukou.keaexam.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*---------- Ayaanle A.Hassan ------------*/
public class ConnectorManager {


  private static Connection connection = null;

  public static Connection getConnection() {
    String DB_URL = "jdbc:mysql://localhost:3306/exam_car";
    String UID = "root";
    String PWD ="koukou11";

    if (connection != null) return connection;
    try {
      connection = DriverManager.getConnection(DB_URL, UID, PWD);

    } catch (SQLException e) {
      System.out.println("Could not connect");
      e.printStackTrace();
    }
    return connection;
  }
}
