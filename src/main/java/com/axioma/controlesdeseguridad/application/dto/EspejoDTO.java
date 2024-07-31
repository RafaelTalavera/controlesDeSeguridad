package com.axioma.controlesdeseguridad.application.dto;

import com.axioma.controlesdeseguridad.domain.models.User;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EspejoDTO {

    private Long id;
    private String codigo;
    private LocalDate fechaEdición;
    private String edicion;
    private String ubicacion;
    private String ruc;
    private String razonSocial;
    private String domicilio;
    private String cantidad;
    private String estado;
    private List<String> observacion;
    private User user;
}
