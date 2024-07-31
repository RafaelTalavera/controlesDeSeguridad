package com.axioma.controlesdeseguridad.domain.models;

import jakarta.persistence.*;
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
@Table(name = "espejos")
@Entity
public class Espejo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
