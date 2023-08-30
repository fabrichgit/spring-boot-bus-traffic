package com.fabrich.busapk.repository;

import com.fabrich.busapk.model.car;
import com.fabrich.busapk.model.people;
import com.fabrich.busapk.model.receiver;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PeopleDAO{
    private Connection connection;

    public PeopleDAO(Connection connection){
        this.connection = connection;
    }

    public people getPeople(int id) throws SQLException {
        String sql = "SELECT * FROM people WHERE id_people = "+id;
        people people = null;

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            ResultSet result = preparedStatement.executeQuery();

            while(result.next()){
                people = new people(
                        result.getInt("id_people"),
                        result.getString("people_firstname"),
                        result.getString("people_lastname"),
                        result.getInt("people_age")
                );
            }
        }
        return people;
    }

}
