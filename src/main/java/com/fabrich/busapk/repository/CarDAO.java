package com.fabrich.busapk.repository;

import com.fabrich.busapk.model.car;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAO {
    private Connection connection;

    public CarDAO(Connection connection){
        this.connection = connection;
    }

    public List<car> getCarsByIdentity(int identity) throws SQLException {
        List<car> cars = new ArrayList<>();
        String sql = "SELECT * FROM car WHERE fk_id_identity_place = "+identity;

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            ResultSet result = preparedStatement.executeQuery();

            while(result.next()){
                convertToList(cars, result);
            }
        }
        return cars;
    }

    private void convertToList(List<car> cars, ResultSet result) throws SQLException {
        cars.add(new car(
            result.getInt("id_car"),
            result.getString("car_identity"),
            result.getInt("fk_id_driver"),
            result.getInt("fk_id_identity_place")
        ));
        System.out.println(result.getInt("id_car"));
    }
}