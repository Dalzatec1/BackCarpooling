package com.demosql.demo.controllers;

import com.demosql.demo.Exception.WalterException;
import com.demosql.demo.dtos.ViajeDto;
import com.demosql.demo.models.Viaje;
import com.demosql.demo.services.ViajesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/viajes")
public class ViajesController {

    @Autowired
    private ViajesService viajesService;

    @GetMapping("/read")
    public Iterable<Viaje> getAllViajesServices() {
        return viajesService.getAllTripsForUser();
    }

    @GetMapping("/origin/{departure}")
    public ResponseEntity<Viaje> getUserByDeparturePoint(@PathVariable String departure){
        Viaje viaje= viajesService.getTripsByDeparturePointContaining(departure);
        if (viaje != null) {
            return new ResponseEntity<>(viaje, HttpStatus.OK);
        } else {
            throw new WalterException("No se encontró un usuario con el ID: " + departure, null);
        }
    }

    @GetMapping("/destiny/{arrival}")
    public ResponseEntity<Viaje> getTripsByArrivalPointContaining(@PathVariable String arrival){
        Viaje viaje= viajesService.getTripsByDeparturePointContaining(arrival);
        if (viaje != null) {
            return new ResponseEntity<>(viaje, HttpStatus.OK);
        } else {
            throw new WalterException("No se encontró un usuario con el ID: " + arrival, null);
        }
    }
}
