package com.fabrich.busapk.controller;

import com.fabrich.busapk.model.people;
import com.fabrich.busapk.service.CarService;
import com.fabrich.busapk.service.PeopleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class PeopleController {
    private PeopleService service;

    public PeopleController(PeopleService service) {
        this.service = service;
    }

    @GetMapping("/people/onTrip/{idTrip}")
    public List<people> getPeopleByTri(@PathVariable int idTrip) throws SQLException {
        return service.getPeopleByTrip(idTrip);
    }
}
