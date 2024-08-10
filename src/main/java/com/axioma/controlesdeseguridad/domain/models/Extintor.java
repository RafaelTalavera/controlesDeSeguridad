package com.axioma.controlesdeseguridad.domain.models;

import jakarta.persistence.*;
import java.time.LocalDate;


@Table(name = "extintores")
@Entity
public class Extintor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private LocalDate fechaEdición;
    private String edicion;
    private String area;
    private String ubicacion;
    private String serie;
    private LocalDate dateRecarga;
    private LocalDate dateVencimiento;
    private LocalDate datePruebaHidrostatica;
    private String empresaRecarga;
    private String cambioDeExtintor;
    private String tipoDeExtintor;
    private String estadoDelCilindro;
    private String estadoDelManometro;
    private String estadoManguera;
    private String pinDeSeguirdad;
    private String observacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    public Extintor() {
    }

    public Extintor(Long id, String codigo, LocalDate fechaEdición, String edicion, String area, String ubicacion, String serie, LocalDate dateRecarga, LocalDate dateVencimiento, LocalDate datePruebaHidrostatica, String empresaRecarga, String cambioDeExtintor, String tipoDeExtintor, String estadoDelCilindro, String estadoDelManometro, String estadoManguera, String pinDeSeguirdad, String observacion, User user) {
        this.id = id;
        this.codigo = codigo;
        this.fechaEdición = fechaEdición;
        this.edicion = edicion;
        this.area = area;
        this.ubicacion = ubicacion;
        this.serie = serie;
        this.dateRecarga = dateRecarga;
        this.dateVencimiento = dateVencimiento;
        this.datePruebaHidrostatica = datePruebaHidrostatica;
        this.empresaRecarga = empresaRecarga;
        this.cambioDeExtintor = cambioDeExtintor;
        this.tipoDeExtintor = tipoDeExtintor;
        this.estadoDelCilindro = estadoDelCilindro;
        this.estadoDelManometro = estadoDelManometro;
        this.estadoManguera = estadoManguera;
        this.pinDeSeguirdad = pinDeSeguirdad;
        this.observacion = observacion;
        this.user = user;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public LocalDate getDateRecarga() {
        return dateRecarga;
    }

    public void setDateRecarga(LocalDate dateRecarga) {
        this.dateRecarga = dateRecarga;
    }

    public LocalDate getDateVencimiento() {
        return dateVencimiento;
    }

    public void setDateVencimiento(LocalDate dateVencimiento) {
        this.dateVencimiento = dateVencimiento;
    }

    public LocalDate getDatePruebaHidrostatica() {
        return datePruebaHidrostatica;
    }

    public void setDatePruebaHidrostatica(LocalDate datePruebaHidrostatica) {
        this.datePruebaHidrostatica = datePruebaHidrostatica;
    }

    public String getEmpresaRecarga() {
        return empresaRecarga;
    }

    public void setEmpresaRecarga(String empresaRecarga) {
        this.empresaRecarga = empresaRecarga;
    }

    public String getCambioDeExtintor() {
        return cambioDeExtintor;
    }

    public void setCambioDeExtintor(String cambioDeExtintor) {
        this.cambioDeExtintor = cambioDeExtintor;
    }

    public String getTipoDeExtintor() {
        return tipoDeExtintor;
    }

    public void setTipoDeExtintor(String tipoDeExtintor) {
        this.tipoDeExtintor = tipoDeExtintor;
    }

    public String getEstadoDelCilindro() {
        return estadoDelCilindro;
    }

    public void setEstadoDelCilindro(String estadoDelCilindro) {
        this.estadoDelCilindro = estadoDelCilindro;
    }

    public String getEstadoDelManometro() {
        return estadoDelManometro;
    }

    public void setEstadoDelManometro(String estadoDelManometro) {
        this.estadoDelManometro = estadoDelManometro;
    }

    public String getEstadoManguera() {
        return estadoManguera;
    }

    public void setEstadoManguera(String estadoManguera) {
        this.estadoManguera = estadoManguera;
    }

    public String getPinDeSeguirdad() {
        return pinDeSeguirdad;
    }

    public void setPinDeSeguirdad(String pinDeSeguirdad) {
        this.pinDeSeguirdad = pinDeSeguirdad;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
