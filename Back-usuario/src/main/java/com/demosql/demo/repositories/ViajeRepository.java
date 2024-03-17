package com.demosql.demo.repositories;

import com.demosql.demo.models.User;
import com.demosql.demo.models.Viaje;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ViajeRepository extends CrudRepository<Viaje, Long> {

    List<Viaje> findByUser(User user);

    Viaje findBypuntoPartida(String departure);

    Viaje finBypuntoLlegada(String arrival);
/*
    // Filter by plate
    @Query("SELECT v FROM Viaje v WHERE v.placaVehiculo LIKE %?1%")
    List<Viaje> findByPlateContaining(String placaVehiculo);

    // Filter by date
    List<Viaje> findByFechaViaje(LocalDate fechaViaje);

    // Filter by driver name (assuming case-insensitive search)
    @Query("SELECT v FROM Viaje v WHERE LOWER(v.nombreConductor) LIKE LOWER(?1%)")
    List<Viaje> findByDriverContaining(String nombreConductor);

    // Filter by departure point
    @Query("SELECT v FROM Viaje v WHERE v.puntoPartida LIKE %?1%")
    List<Viaje> findByDeparturePointContaining(String puntoPartida);

    // Filter by arrival point
    @Query("SELECT v FROM Viaje v WHERE v.puntoLlegada LIKE %?1%")
    List<Viaje> findByArrivalPointContaining(String puntoLlegada);

    // Combine filters (optional)
    @Query("SELECT v FROM Viaje v WHERE v.user = ?1 AND v.placaVehiculo LIKE %?2% AND v.fechaViaje = ?3")
    List<Viaje> findByUserAndPlateAndDate(User user, String placaVehiculo, LocalDate fechaViaje);

 */

}
