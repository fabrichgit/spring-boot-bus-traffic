package com.fabrich.busapk.service;

import com.fabrich.busapk.model.passenger;
import com.fabrich.busapk.model.people;
import com.fabrich.busapk.repository.PassengerDAO;
import com.fabrich.busapk.repository.PeopleDAO;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class PeopleService {
    private PeopleDAO peopleDAO;
    private PassengerDAO passengerDAO;

    public PeopleService(PeopleDAO peopleDAO, PassengerDAO passengerDAO) {
        this.peopleDAO = peopleDAO;
        this.passengerDAO = passengerDAO;
    }

    public List<people> getPeopleByTrip(int idTrip) throws SQLException {
        List<passenger> passengerList = passengerDAO.getPassengersByIdTrip(idTrip);
        List<people> peopleList = new ArrayList<>();
        for(passenger passenger : passengerList){
            peopleList.add(peopleDAO.getPeople(passenger.getFkIdPeople()));
        }
        return peopleList;
    }
}
