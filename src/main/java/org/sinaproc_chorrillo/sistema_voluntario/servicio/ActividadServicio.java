package org.sinaproc_chorrillo.sistema_voluntario.servicio;

import org.sinaproc_chorrillo.sistema_voluntario.modelo.Actividad;
import org.sinaproc_chorrillo.sistema_voluntario.repositorio.ActividadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActividadServicio {
    @Autowired
    private ActividadRepositorio actividadRepositorio;

    public List<Actividad> obtenerTodas() {
        return actividadRepositorio.findAll();
    }
    /**
     * Guarda una nueva actividad en la base de datos.
     * @param actividad La actividad a guardar.
     * @return La actividad guardada.
     */
    public Actividad guardar(Actividad actividad) {
        return actividadRepositorio.save(actividad);
    }
    /**
     * Obtiene una actividad por su ID.
     *
     * @param id El ID de la actividad.
     * @return La actividad encontrada o null si no existe.
     */
    public void eliminar(Long id) {
        actividadRepositorio.deleteById(Math.toIntExact(id));
    }
    public Optional<Actividad> obtenerPorId(Long id) {
        return actividadRepositorio.findById(Math.toIntExact(id));
    }
}
