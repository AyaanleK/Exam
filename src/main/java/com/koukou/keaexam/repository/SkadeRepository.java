package com.koukou.keaexam.repository;

import com.koukou.keaexam.connection.ConnectorManager;
import com.koukou.keaexam.model.SkadeModel;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SkadeRepository {

    private Connection connection;

    public SkadeRepository() {
        connection = ConnectorManager.getConnection();
    }

    public List<SkadeModel> getAllSkade() {
        connection = ConnectorManager.getConnection();

        List<SkadeModel> car = new ArrayList<>();
        final String QUERY = "SELECT * FROM dommage";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY);
            while (resultSet.next()) {

                int dommage_id = resultSet.getInt(1);
                String dommage_date = resultSet.getString(2);
                String dommage_description = resultSet.getString(3);
                String dommage_chassisNumber = resultSet.getString(4);
                int dommage_total_cost = resultSet.getInt(5);

                car.add(new SkadeModel(dommage_id, dommage_date, dommage_description, dommage_chassisNumber, dommage_total_cost));
            }
            System.out.println("Kan vise alle skadede biler");

            statement.close();

        } catch (SQLException e) {
            System.out.println("Kan ikke forbinde" + e);
            e.printStackTrace();
        }
        return car;
    }

    public void addSkade(SkadeModel skade){

        connection = ConnectorManager.getConnection();

        final String QUERY= (
                ("INSERT INTO dommage") +
                        "( dommage_id, dommage_date, dommage_description, dommage_chassisNumber, dommage_total_cost)" +
                        " VALUE(?,?,?,?,?)"
        );
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(QUERY);


            preparedStatement.setInt(1, skade.getDommage_id());
            preparedStatement.setString(2, skade.getDommage_date());
            preparedStatement.setString(3, skade.getDommage_description());
            preparedStatement.setString(4, skade.getDommage_chassisNumber());
            preparedStatement.setInt(5, skade.getDommage_total_cost());

            preparedStatement.executeUpdate();
            System.out.println("Den skadede vil er tilføjet");
        }catch (SQLException e){
            System.out.println("Kunne ikke tilføje");
            e.printStackTrace();
        }
    }

}
