package com.koukou.keaexam.repository;

import com.koukou.keaexam.connection.ConnectorManager;
import com.koukou.keaexam.model.ForretningsudviklerModel;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ForretningsudviklerRepository {

    private Connection connection;

    public ForretningsudviklerRepository() {
        connection = ConnectorManager.getConnection();
    }

    public List<ForretningsudviklerModel> getTotalPris() {
        connection = ConnectorManager.getConnection();

        List<ForretningsudviklerModel> forretningsU2 = new ArrayList<>();
        final String QUERY = "SELECT SUM(car_registration_fee) as total_pris FROM car";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY);
            while (resultSet.next()) {

                String total_pris = resultSet.getString(1);

                forretningsU2.add(new ForretningsudviklerModel(total_pris));
            }
            System.out.println("Kan vise total pris og alle abonnementer.");
            statement.close();
        } catch (SQLException e) {
            System.out.println("Kan ikke forbinde" + e);
            e.printStackTrace();
        }
        return forretningsU2;
    }

    public List<ForretningsudviklerModel> getTotalAbonnementer() {
        connection = ConnectorManager.getConnection();

        List<ForretningsudviklerModel> forretningsU1 = new ArrayList<>();
        final String QUERY = "SELECT COUNT(*) as total_abonnementer FROM car";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY);
            while (resultSet.next()) {

                String total_abonnementer = resultSet.getString(1);

                forretningsU1.add(new ForretningsudviklerModel(total_abonnementer));
            }
            System.out.println("Kan vise total pris og alle abonnementer.");
            statement.close();
        } catch (SQLException e) {
            System.out.println("Kan ikke forbinde" + e);
            e.printStackTrace();
        }
        return forretningsU1;
    }
}
