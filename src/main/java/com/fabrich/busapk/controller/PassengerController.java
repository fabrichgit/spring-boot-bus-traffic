package com.fabrich.busapk.controller;

import com.fabrich.busapk.DTO.PassengerReduced;
import com.fabrich.busapk.service.PassengerService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
public class PassengerController {
    private PassengerService service;

    public PassengerController(PassengerService service) {
        this.service = service;
    }

    @PostMapping("/passenger/gotrip")
    public String create(@RequestBody PassengerReduced passengerToInsert) throws SQLException {
        return service.InsertPassenger(passengerToInsert);
    }
}
