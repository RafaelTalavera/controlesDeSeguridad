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
@Table(name = "tablero-electrico")
@Entity
public class TablerosElectrico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private LocalDate fechaEdición;
    private String edicion;
    private LocalDate date;
    private String ubicacion;

    private Boolean estructura;
    private String estructuraComentarios;

    private Boolean puertaChapaInterruptor;
    private String puertaChapaInterruptorComentario;

    private Boolean tomaCorriente;
    private String tomaCorrienteComentario;

    private Boolean senalizacion;
    private String senalizacionComentario;

    private Boolean seccionado;
    private String seccionadoComentario;

    private Boolean interruptor;
    private String interruptorComentario;

    private Boolean cablesDimension;
    private String cablesDimensionComentario;

    private Boolean conexionado;
    private String conexionadoComenatrio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
