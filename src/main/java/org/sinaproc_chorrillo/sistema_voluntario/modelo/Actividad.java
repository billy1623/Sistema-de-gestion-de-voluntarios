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

    //Getters and Setters


}
