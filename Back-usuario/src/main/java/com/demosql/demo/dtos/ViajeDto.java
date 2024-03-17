package com.demosql.demo.dtos;

import java.time.LocalDate;

import com.demosql.demo.models.Viaje;
import com.demosql.demo.services.ViajesService;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ViajeDto {

    private String placaVehiculo;
    private String puntoPartida;
    private String puntoLlegada;
    private LocalDate fechaViaje;
    private String nombreConductor;
}
