package org.sinaproc_chorrillo.sistema_voluntario.modelo;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDate;

@Entity
public class Actividad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private Date fecha;
    private String horaInicio;
    private String horaFin;
    private String lugar;
    private String organizador;
    private String estado;
    private String tipoActividad;
    private String PersonaEncargada;

    @ManyToOne Voluntario voluntarioResponsable;
    public Actividad() {
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    public String getHoraFin() {
        return horaFin;
    }
    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getOrganizador() {
        return organizador;
    }
    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getTipoActividad() {
        return tipoActividad;
    }
    public void setTipoActividad(String tipoActividad) {
        this.tipoActividad = tipoActividad;
    }
    public String getPersonaEncargada() {
        return PersonaEncargada;
    }
    public void setPersonaEncargada(String personaEncargada) {
        PersonaEncargada = personaEncargada;
    }
    public Voluntario getVoluntarioResponsable() {
        return voluntarioResponsable;
    }
    public void setVoluntarioResponsable(Voluntario voluntarioResponsable) {
        this.voluntarioResponsable = voluntarioResponsable;
    }


}
