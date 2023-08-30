package com.fabrich.busapk.service;

import com.fabrich.busapk.model.car;
import com.fabrich.busapk.model.identityPlace;
import com.fabrich.busapk.model.trip;
import com.fabrich.busapk.repository.CarDAO;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class CarService {
    private CarDAO CarDAO;

    public CarService(CarDAO CarDAO) {
        this.CarDAO = CarDAO;
    }

    public List<car> getCars(String meaning) throws SQLException {
        int identity = identityPlace.ReverseMeaningOf(meaning);
        return CarDAO.getCarsByIdentity(identity);
    }
}
