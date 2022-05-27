package com.koukou.keaexam.connection;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorManager {


  private static Connection connection = null;

  public static Connection getConnection() {
    //connection er en singleton
    //connection already initialized?
    String DB_URL = "jdbc:mysql://localhost:3306/exam_car";
    String UID = "root";
    String PWD ="koukou11";

    if (connection != null) return connection;

    //initialize connection
    try {
      connection = DriverManager.getConnection(DB_URL, UID, PWD);

    } catch (SQLException e) {
      System.out.println("Could not connect");
      e.printStackTrace();
    }
    return connection;

  }

   /*


  public static Connection getConnection() throws URISyntaxException, SQLException {
    URI dbUri = new URI(System.getenv("jdbc:mysql://localhost:3306/exam_car"));

    String username = dbUri.getUserInfo().split("root")[0];
    String password = dbUri.getUserInfo().split("koukou11")[1];
    String dbUrl = "jdbc:mysql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

    return DriverManager.getConnection(dbUrl, username, password);
  }

   */
}
