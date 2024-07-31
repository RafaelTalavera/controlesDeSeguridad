package com.axioma.controlesdeseguridad.domain.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "emergency-lights")
@Entity
public class EmergencyLights {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private LocalDate fechaEdición;
    private String edicion;
    private LocalDate date;
    private String ubicacion;
    private String senalizacion;
    private String direcionado;
    private String acceso;
    private String conectado;
    private String funciona;
    private String limpio;
    private String observacion;
    private String conclusion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


}
