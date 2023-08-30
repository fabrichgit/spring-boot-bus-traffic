package com.fabrich.busapk.controller;

import com.fabrich.busapk.DTO.tripDetails;
import com.fabrich.busapk.model.car;
import com.fabrich.busapk.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class CarController {
    private CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping("/car/{meaning}")
    public List<car> getCars(@PathVariable String meaning) throws SQLException {
        return service.getCars(meaning);
    }
}
