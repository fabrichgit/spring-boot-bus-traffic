package com.fabrich.busapk.repository;

import com.fabrich.busapk.model.driver;
import com.fabrich.busapk.model.receiver;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class ReceiverDAO {

    private Connection connection;

    public ReceiverDAO(Connection connection){
        this.connection = connection;
    }

    public receiver findOne(int id) throws SQLException {
        String sql = "SELECT * FROM receiver WHERE id_receiver="+id;
        receiver receiver = null;

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            ResultSet result = preparedStatement.executeQuery();

            while(result.next()){
                receiver = new receiver (
                        result.getInt("id_receiver"),
                        result.getString("receiver_firstname"),
                        result.getString("receiver_lastname"),
                        result.getInt("receiver_age")
                );
            }
        }
        return receiver;
    }

}
