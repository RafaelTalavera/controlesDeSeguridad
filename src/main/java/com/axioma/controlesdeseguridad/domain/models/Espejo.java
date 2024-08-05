package com.axioma.controlesdeseguridad.domain.models;

import jakarta.persistence.*;


import java.time.LocalDate;
import java.util.List;


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

    public Espejo() {
    }

    public Espejo(Long id, String codigo, LocalDate fechaEdición, String edicion, String ubicacion, String ruc, String razonSocial, String domicilio, String cantidad, String estado, List<String> observacion, User user) {
        this.id = id;
        this.codigo = codigo;
        this.fechaEdición = fechaEdición;
        this.edicion = edicion;
        this.ubicacion = ubicacion;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.cantidad = cantidad;
        this.estado = estado;
        this.observacion = observacion;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaEdición() {
        return fechaEdición;
    }

    public void setFechaEdición(LocalDate fechaEdición) {
        this.fechaEdición = fechaEdición;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<String> getObservacion() {
        return observacion;
    }

    public void setObservacion(List<String> observacion) {
        this.observacion = observacion;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
