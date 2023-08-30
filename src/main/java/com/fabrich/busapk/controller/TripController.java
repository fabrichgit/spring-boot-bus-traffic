package com.fabrich.busapk.controller;

import com.fabrich.busapk.DTO.TripReduced;
import com.fabrich.busapk.DTO.tripDetails;
import com.fabrich.busapk.model.identityPlace;
import com.fabrich.busapk.model.trip;
import com.fabrich.busapk.service.TripDetailsService;
import com.fabrich.busapk.service.TripService;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

@RestController
public class TripController {

    private TripService service;
    private TripDetailsService tripDetailsService;

    public TripController(TripService service, TripDetailsService tripDetailsService)
    {
        this.service = service;
        this.tripDetailsService = tripDetailsService;
    }

    @GetMapping("/trip/showall")
    public List<trip> getAllTrip() throws SQLException {
        return service.getAllTrip();
    }

    @GetMapping("/trip/bus/{busline}")
    public List<tripDetails> getAllTrip(@PathVariable String busline) throws SQLException {
        int identity = identityPlace.ReverseMeaningOf(busline);
        System.out.println(busline);
        System.out.println(identity);
        return tripDetailsService.findYourTrip(identity);
    }

    @DeleteMapping("/trip/delete/{id}")
    public String delete(@PathVariable int id) throws SQLException {
        return service.deleteTrip(id);
    }

    @PostMapping("/trip/create")
    public String createTrip(@RequestBody TripReduced TripToInsert) throws SQLException {
        return service.InsertTrip(TripToInsert);
    }

}
