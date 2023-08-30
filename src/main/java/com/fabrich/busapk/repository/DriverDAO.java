package com.fabrich.busapk.repository;

import com.fabrich.busapk.DTO.tripDetails;
import com.fabrich.busapk.model.driver;
import com.fabrich.busapk.model.trip;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class DriverDAO {

    private Connection connection;

    public DriverDAO(Connection connection){
        this.connection = connection;
    }

    public driver findOne(int id) throws SQLException {
        String sql = "SELECT * FROM driver WHERE id_driver="+id;
        driver driver = null;

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            ResultSet result = preparedStatement.executeQuery();

            while(result.next()){
                driver = new driver (
                        result.getInt("id_driver"),
                        result.getString("driver_firstname"),
                        result.getString("driver_lastname"),
                        result.getInt("driver_age")
                );
            }
        }
        return driver;
    }

    public driver findOneByCar(int idCar) throws SQLException {
        String idDriverSql = "SELECT fk_id_driver FROM car WHERE id_car="+idCar;
        String sql = "SELECT * FROM driver WHERE id_driver=("+idDriverSql+")";
        driver driver = null;

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            ResultSet result = preparedStatement.executeQuery();

            while(result.next()){
                driver = new driver (
                        result.getInt("id_driver"),
                        result.getString("driver_firstname"),
                        result.getString("driver_lastname"),
                        result.getInt("driver_age")
                );
            }
        }
        return driver;
    }

}
