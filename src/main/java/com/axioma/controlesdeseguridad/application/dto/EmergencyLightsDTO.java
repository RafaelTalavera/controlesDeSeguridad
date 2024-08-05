package com.axioma.controlesdeseguridad.application.dto;

import com.axioma.controlesdeseguridad.domain.models.User;
import java.time.LocalDate;


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

    public EmergencyLightsDTO() {
    }

    public EmergencyLightsDTO(Long id, String codigo, LocalDate fechaEdición, String edicion, LocalDate date, String ubicacion, String senalizacion, String direcionado, String acceso, String conectado, String funciona, String limpio, String observacion, String conclusion, User user) {
        this.id = id;
        this.codigo = codigo;
        this.fechaEdición = fechaEdición;
        this.edicion = edicion;
        this.date = date;
        this.ubicacion = ubicacion;
        this.senalizacion = senalizacion;
        this.direcionado = direcionado;
        this.acceso = acceso;
        this.conectado = conectado;
        this.funciona = funciona;
        this.limpio = limpio;
        this.observacion = observacion;
        this.conclusion = conclusion;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getSenalizacion() {
        return senalizacion;
    }

    public void setSenalizacion(String senalizacion) {
        this.senalizacion = senalizacion;
    }

    public String getDirecionado() {
        return direcionado;
    }

    public void setDirecionado(String direcionado) {
        this.direcionado = direcionado;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public String getConectado() {
        return conectado;
    }

    public void setConectado(String conectado) {
        this.conectado = conectado;
    }

    public String getFunciona() {
        return funciona;
    }

    public void setFunciona(String funciona) {
        this.funciona = funciona;
    }

    public String getLimpio() {
        return limpio;
    }

    public void setLimpio(String limpio) {
        this.limpio = limpio;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
