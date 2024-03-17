package com.demosql.demo.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.Serializable;
@Data
@Table(name="viajes")
@With
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class Viaje implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placaVehiculo;
    private String puntoPartida;
    private String puntoLlegada;
    private LocalDate fechaViaje;
    private String nombreConductor;

}