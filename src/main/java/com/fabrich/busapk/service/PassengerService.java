package com.fabrich.busapk.service;

import com.fabrich.busapk.DTO.PassengerReduced;
import com.fabrich.busapk.model.car;
import com.fabrich.busapk.repository.CarDAO;
import com.fabrich.busapk.repository.PassengerDAO;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
public class PassengerService {
    private PassengerDAO passengerDAO;

    public PassengerService(PassengerDAO passengerDAO) {
        this.passengerDAO = passengerDAO;
    }

    public String InsertPassenger(PassengerReduced passengerToInsert) throws SQLException {
        passengerDAO.InsertPassenger(passengerToInsert);
        return "INsert successfully";
    }
}
