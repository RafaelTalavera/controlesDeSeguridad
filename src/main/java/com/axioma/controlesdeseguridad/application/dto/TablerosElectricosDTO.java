package com.axioma.controlesdeseguridad.application.dto;

import com.axioma.controlesdeseguridad.domain.models.User;


import java.time.LocalDate;


public class TablerosElectricosDTO {
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
    private User user;

    public TablerosElectricosDTO() {
    }

    public TablerosElectricosDTO(Long id, String codigo, LocalDate fechaEdición, String edicion, LocalDate date, String ubicacion, Boolean estructura, String estructuraComentarios, Boolean puertaChapaInterruptor, String puertaChapaInterruptorComentario, Boolean tomaCorriente, String tomaCorrienteComentario, Boolean senalizacion, String senalizacionComentario, Boolean seccionado, String seccionadoComentario, Boolean interruptor, String interruptorComentario, Boolean cablesDimension, String cablesDimensionComentario, Boolean conexionado, String conexionadoComenatrio, User user) {
        this.id = id;
        this.codigo = codigo;
        this.fechaEdición = fechaEdición;
        this.edicion = edicion;
        this.date = date;
        this.ubicacion = ubicacion;
        this.estructura = estructura;
        this.estructuraComentarios = estructuraComentarios;
        this.puertaChapaInterruptor = puertaChapaInterruptor;
        this.puertaChapaInterruptorComentario = puertaChapaInterruptorComentario;
        this.tomaCorriente = tomaCorriente;
        this.tomaCorrienteComentario = tomaCorrienteComentario;
        this.senalizacion = senalizacion;
        this.senalizacionComentario = senalizacionComentario;
        this.seccionado = seccionado;
        this.seccionadoComentario = seccionadoComentario;
        this.interruptor = interruptor;
        this.interruptorComentario = interruptorComentario;
        this.cablesDimension = cablesDimension;
        this.cablesDimensionComentario = cablesDimensionComentario;
        this.conexionado = conexionado;
        this.conexionadoComenatrio = conexionadoComenatrio;
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

    public Boolean getEstructura() {
        return estructura;
    }

    public void setEstructura(Boolean estructura) {
        this.estructura = estructura;
    }

    public String getEstructuraComentarios() {
        return estructuraComentarios;
    }

    public void setEstructuraComentarios(String estructuraComentarios) {
        this.estructuraComentarios = estructuraComentarios;
    }

    public Boolean getPuertaChapaInterruptor() {
        return puertaChapaInterruptor;
    }

    public void setPuertaChapaInterruptor(Boolean puertaChapaInterruptor) {
        this.puertaChapaInterruptor = puertaChapaInterruptor;
    }

    public String getPuertaChapaInterruptorComentario() {
        return puertaChapaInterruptorComentario;
    }

    public void setPuertaChapaInterruptorComentario(String puertaChapaInterruptorComentario) {
        this.puertaChapaInterruptorComentario = puertaChapaInterruptorComentario;
    }

    public Boolean getTomaCorriente() {
        return tomaCorriente;
    }

    public void setTomaCorriente(Boolean tomaCorriente) {
        this.tomaCorriente = tomaCorriente;
    }

    public String getTomaCorrienteComentario() {
        return tomaCorrienteComentario;
    }

    public void setTomaCorrienteComentario(String tomaCorrienteComentario) {
        this.tomaCorrienteComentario = tomaCorrienteComentario;
    }

    public Boolean getSenalizacion() {
        return senalizacion;
    }

    public void setSenalizacion(Boolean senalizacion) {
        this.senalizacion = senalizacion;
    }

    public String getSenalizacionComentario() {
        return senalizacionComentario;
    }

    public void setSenalizacionComentario(String senalizacionComentario) {
        this.senalizacionComentario = senalizacionComentario;
    }

    public Boolean getSeccionado() {
        return seccionado;
    }

    public void setSeccionado(Boolean seccionado) {
        this.seccionado = seccionado;
    }

    public String getSeccionadoComentario() {
        return seccionadoComentario;
    }

    public void setSeccionadoComentario(String seccionadoComentario) {
        this.seccionadoComentario = seccionadoComentario;
    }

    public Boolean getInterruptor() {
        return interruptor;
    }

    public void setInterruptor(Boolean interruptor) {
        this.interruptor = interruptor;
    }

    public String getInterruptorComentario() {
        return interruptorComentario;
    }

    public void setInterruptorComentario(String interruptorComentario) {
        this.interruptorComentario = interruptorComentario;
    }

    public Boolean getCablesDimension() {
        return cablesDimension;
    }

    public void setCablesDimension(Boolean cablesDimension) {
        this.cablesDimension = cablesDimension;
    }

    public String getCablesDimensionComentario() {
        return cablesDimensionComentario;
    }

    public void setCablesDimensionComentario(String cablesDimensionComentario) {
        this.cablesDimensionComentario = cablesDimensionComentario;
    }

    public Boolean getConexionado() {
        return conexionado;
    }

    public void setConexionado(Boolean conexionado) {
        this.conexionado = conexionado;
    }

    public String getConexionadoComenatrio() {
        return conexionadoComenatrio;
    }

    public void setConexionadoComenatrio(String conexionadoComenatrio) {
        this.conexionadoComenatrio = conexionadoComenatrio;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
