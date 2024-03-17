package com.demosql.demo.services;

import com.demosql.demo.models.Viaje;
import com.demosql.demo.repositories.ViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ViajesService {

    @Autowired
    private ViajeRepository viajeRepository;

    public Iterable<Viaje> getAllTripsForUser() {
        return viajeRepository.findAll();
    }

    // Filter by departure point
    public Viaje getTripsByDeparturePointContaining(String departure) {
        return viajeRepository.findBypuntoPartida(departure);
    }

    // Filter by arrival point
    public Viaje getTripsByArrivalPointContaining(String arrival) {
        return viajeRepository.finBypuntoLlegada(arrival);
    }
}