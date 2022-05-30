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

        List<ForretningsudviklerModel> forretmodel = new ArrayList<>();
        final String QUERY = "SELECT SUM(pris) as total_pris FROM car";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY);
            while (resultSet.next()) {

                String total_pris = resultSet.getString(1);

                forretmodel.add(new ForretningsudviklerModel(total_pris));
            }
            System.out.println("Kan vise total pris og alle abonnementer.");
            statement.close();
        } catch (SQLException e) {
            System.out.println("Kan ikke forbinde" + e);
            e.printStackTrace();
        }
        return forretmodel;
    }

    public List<ForretningsudviklerModel> getTotalAbonnementer() {
        connection = ConnectorManager.getConnection();

        List<ForretningsudviklerModel> forretmodel = new ArrayList<>();
        final String QUERY = "SELECT COUNT(*) as total_abonnementer FROM car";

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(QUERY);
            while (resultSet.next()) {

                String totale_abonnementer = resultSet.getString(2);

                forretmodel.add(new ForretningsudviklerModel(totale_abonnementer));
            }
            System.out.println("Kan vise total pris og alle abonnementer.");
            statement.close();
        } catch (SQLException e) {
            System.out.println("Kan ikke forbinde" + e);
            e.printStackTrace();
        }
        return forretmodel;
    }
}
