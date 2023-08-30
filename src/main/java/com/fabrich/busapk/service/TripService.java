package com.fabrich.busapk.service;

import com.fabrich.busapk.DTO.TripReduced;
import com.fabrich.busapk.DTO.tripDetails;
import com.fabrich.busapk.model.car;
import com.fabrich.busapk.model.trip;
import com.fabrich.busapk.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.sound.midi.Receiver;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class TripService {

    private TripDAO tripDAO;
    private CarDAO carDAO;
    private PassengerDAO passengerDAO;

    public List<trip> getAllTrip() throws SQLException {
        return tripDAO.getAll();
    }

    public String deleteTrip(int idTrip) throws SQLException{
        passengerDAO.deletePassengerByIdTrip(idTrip);
        tripDAO.deleteTripById(idTrip);
        return "delete successfuly";
    }

    public String InsertTrip(TripReduced tripToInsert) throws SQLException{
        tripDAO.createTrip(tripToInsert);
        return "insert checked";
    }

}
