package com.fabrich.busapk.service;

import com.fabrich.busapk.DTO.tripDetails;
import com.fabrich.busapk.model.*;
import com.fabrich.busapk.repository.CarDAO;
import com.fabrich.busapk.repository.DriverDAO;
import com.fabrich.busapk.repository.ReceiverDAO;
import com.fabrich.busapk.repository.TripDAO;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TripDetailsService {
    private CarDAO carDAO;
    private TripDAO tripDAO;
    private DriverDAO driverDAO;
    private ReceiverDAO receiverDAO;

    public TripDetailsService(CarDAO carDAO, TripDAO tripDAO, DriverDAO driverDAO, ReceiverDAO receiverDAO) {
        this.carDAO = carDAO;
        this.tripDAO = tripDAO;
        this.driverDAO = driverDAO;
        this.receiverDAO = receiverDAO;
    }


    public List<tripDetails> findYourTrip (int identity) throws SQLException {

        List<car> cars = carDAO.getCarsByIdentity(identity);

        List<trip> trips = new ArrayList<>();
        for(car Car : cars){
            List<trip> Trips = tripDAO.getTripsByCar(Car.getId());
            trips.addAll(Trips);
        }

        List<tripDetails> tripDetails = new ArrayList<>();
        for(trip trip : trips){
            receiver receiver = receiverDAO.findOne(trip.getFkIdReceiver());
            String dateOfGoing = trip.getDateOfGoing();
            String identityMeaning = identityPlace.MeaningOf(identity);
            driver driver = driverDAO.findOneByCar(trip.getFkIdCar());

            tripDetails TripDetails = new tripDetails(driver, receiver, dateOfGoing, identityMeaning);

            tripDetails.add(TripDetails);
        }

        return tripDetails;
    }
}
