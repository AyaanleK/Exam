package com.koukou.keaexam.repository;

import com.koukou.keaexam.connection.ConnectorManager;
import com.koukou.keaexam.model.CarModel;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*---------- Ayaanle A.Hassan ------------*/

@Repository
public class CarRepository {

  private Connection connection;


  public CarRepository() {
    connection = ConnectorManager.getConnection();
  }

  public List<CarModel> getAllCars(){

    connection = ConnectorManager.getConnection();


    List<CarModel> car = new ArrayList<>();
    final String QUERY = "SELECT * FROM car";

    try {
      Statement statement=connection.createStatement();
      ResultSet resultSet= statement.executeQuery(QUERY);
      while (resultSet.next()){

        String car_chassis_number = resultSet.getString(1);
        String car_color = resultSet.getString(2);
        String car_model = resultSet.getString(3);
        String car_registration_fee = resultSet.getString(4);




        car.add(new CarModel(car_chassis_number, car_color, car_model,
            car_registration_fee));
      }
      System.out.println("can show all cars");

      statement.close();

    }
    catch (SQLException e){
      System.out.println(e + "can not show all cars");
      e.printStackTrace();
    }
    return car;
  }

  public void addCar(CarModel car){

    connection = ConnectorManager.getConnection();

    final String QUERY= (
        ("INSERT INTO car") +
        "( car_chassis_number, car_color, car_model, car_registration_fee)" +
        " VALUE(?,?,?,?)"
                        );
    try {
      PreparedStatement preparedStatement=connection.prepareStatement(QUERY);


      preparedStatement.setString(1, car.getCar_chassis_number());
      preparedStatement.setString(2, car.getCar_color());
      preparedStatement.setString(3, car.getCar_model());
      preparedStatement.setString(4, car.getCar_registration_fee());

      preparedStatement.executeUpdate();
      System.out.println("the car is added");
    }catch (SQLException e){
      System.out.println(" can not add");
      e.printStackTrace();
    }
  }


}
