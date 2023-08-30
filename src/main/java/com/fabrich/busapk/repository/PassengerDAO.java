package com.fabrich.busapk.repository;

import com.fabrich.busapk.DTO.PassengerReduced;
import com.fabrich.busapk.model.passenger;
import com.fabrich.busapk.model.people;
import com.fabrich.busapk.model.trip;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PassengerDAO {
    private Connection connection;

    public PassengerDAO(Connection connection){
        this.connection = connection;
    }

    public List<passenger> getPassengersByIdTrip(int idTrip) throws SQLException{
        List<passenger> passengers = new ArrayList<>();
        String sql = "SELECT * FROM passenger WHERE fk_id_trip = "+idTrip;

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            ResultSet result = preparedStatement.executeQuery();

            while(result.next()){
                convertToList(passengers, result);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }

        return passengers;
    }

    public void deletePassengerByIdTrip(int idTrip) throws SQLException {
        String sql = "DELETE FROM passenger WHERE fk_id_trip = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, idTrip);
            preparedStatement.executeUpdate();
            System.out.println("deletePasenger checked");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void InsertPassenger(PassengerReduced passengerToInsert) throws SQLException {
        String sql = "INSERT INTO passenger (fk_id_people, fk_id_trip) values (?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, passengerToInsert.getFkIdPeople());
            preparedStatement.setInt(2, passengerToInsert.getFkIdTrip());
            preparedStatement.executeUpdate();
            System.out.println("insertPassenger checked");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void convertToList(List<passenger> passengers, ResultSet result) throws SQLException {
        passengers.add(new passenger(
                result.getInt("id_passenger"),
                result.getInt("fk_id_people"),
                result.getInt("fk_id_trip")
        ));
    }

}
