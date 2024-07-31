package com.axioma.controlesdeseguridad.application.dto;

import com.axioma.controlesdeseguridad.domain.models.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmergencyLightsDTO {

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
    private User user;
}
