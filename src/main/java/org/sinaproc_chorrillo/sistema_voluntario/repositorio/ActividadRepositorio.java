package org.sinaproc_chorrillo.sistema_voluntario.repositorio;

import org.sinaproc_chorrillo.sistema_voluntario.modelo.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActividadRepositorio extends JpaRepository<Actividad,Integer> {
    List<Actividad> findByVoluntarioResponsableId(Long voluntarioId);

}
