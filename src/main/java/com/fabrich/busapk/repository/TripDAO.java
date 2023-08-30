package com.fabrich.busapk.repository;

import com.fabrich.busapk.DTO.TripReduced;
import com.fabrich.busapk.model.trip;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Repository
public class TripDAO {

    private Connection connection;
    private PassengerDAO PassengerDAO;

    public TripDAO(Connection connection, PassengerDAO PassengerDAO){
        this.PassengerDAO = PassengerDAO;
        this.connection = connection;
    }

    public void createTrip(TripReduced tripToInsert) throws SQLException {
        String sql = "INSERT INTO trip (fk_id_car, fk_id_receiver, date_of_going) values(?, ?, now())";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, tripToInsert.getFkIdCar());
            preparedStatement.setInt(2, tripToInsert.getFkIdReceiver());
            preparedStatement.executeUpdate();
            System.out.println("Inserttrip checked");
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }

    }


    public void deleteTripById(int id) throws SQLException {
        String sql = "DELETE FROM trip WHERE id_trip = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("deletetrip checked");
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }

    }

    public List<trip> getTripsByCar(int idCar) throws SQLException{
        List<trip> trips = new ArrayList<>();
        String sql = "SELECT * FROM trip WHERE fk_id_car = "+idCar;

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            ResultSet result = preparedStatement.executeQuery();

            while(result.next()){
                convertToList(trips, result);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }

        return trips;
    }

    public List<trip> getAll() throws SQLException {
        List<trip> allTrip = new ArrayList<>();
        String sql = "SELECT * FROM trip";

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            ResultSet result = preparedStatement.executeQuery();

            while(result.next()){
                convertToList(allTrip, result);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }

        return allTrip;
    }

    private void convertToList(List<trip> allTrip, ResultSet result) throws SQLException {
        allTrip.add(new trip(
                result.getInt("id_trip"),
                result.getInt("fk_id_car"),
                result.getInt("fk_id_receiver"),
                result.getString("date_of_going")
        ));
    }

}
