package com.koukou.keaexam.repository;

import com.koukou.keaexam.connection.ConnectorManager;
import com.koukou.keaexam.model.CarModel;
import com.koukou.keaexam.model.DommageModel;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DommageRepository {

  private Connection connection;


  public DommageRepository() {
    connection = ConnectorManager.getConnection();
  }

  public List<DommageModel> getAllCarDommage(){

    connection = ConnectorManager.getConnection();


    List<DommageModel> dommage = new ArrayList<>();
    final String QUERY = "SELECT * FROM dommage ";

    try {
      Statement statement=connection.createStatement();
      ResultSet resultSet= statement.executeQuery(QUERY);
      while (resultSet.next()){

        int car_dommage_id = resultSet.getInt(1);
        String car_dommage_date = resultSet.getString(2);
        String car_dommage_description = resultSet.getString(3);
        int dommage_total_cost = resultSet.getInt(4);
        int car_chassis_number = resultSet.getInt(4);




        dommage.add(new DommageModel(car_dommage_id, car_dommage_date, car_dommage_description,
            dommage_total_cost, car_chassis_number));
      }
      System.out.println("can show all dommages");

      statement.close();

    }
    catch (SQLException e){
      System.out.println(e + "can not show all dommages");
      e.printStackTrace();
    }
    return dommage;
  }


  public void addControleDommage(DommageModel controlDamage){

    connection = ConnectorManager.getConnection();

    final String QUERY= (
        ("INSERT INTO dommage") +
            "( car_dommage_id, car_dommage_date, car_dommage_description,\n" +
            "            dommage_total_cost, car_chassis_number)" +
            " VALUE(?,?,?,?,?)"
    );
    try {
      PreparedStatement preparedStatement=connection.prepareStatement(QUERY);


      preparedStatement.setInt(1, controlDamage.getDommage_id());
      preparedStatement.setString(2, controlDamage.getDommage_date());
      preparedStatement.setString(3, controlDamage.getDommage_description());
      preparedStatement.setInt(4, controlDamage.getDommage_total_cost());
      preparedStatement.setInt(5, controlDamage.getDommage_chassisNumber());


      preparedStatement.executeUpdate();
      System.out.println("the dommage controle is added");
    }catch (SQLException e){
      System.out.println(" can not add dommage controle");
      e.printStackTrace();
    }
  }

}
