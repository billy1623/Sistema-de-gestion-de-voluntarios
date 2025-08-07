package org.sinaproc_chorrillo.sistema_voluntario.controlador;

import org.sinaproc_chorrillo.sistema_voluntario.modelo.Actividad;
import org.sinaproc_chorrillo.sistema_voluntario.servicio.ActividadServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/actividades")
public class ActividadControlador {

    @Autowired
    private ActividadServicio actividadServicio;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("actividades", actividadServicio.obtenerTodas());
        return "actividades/listar";
    }

    @GetMapping ("/nuevo")
    public String formulario(Model model) {
        model.addAttribute("actividad", new Actividad());
        return "actividades/formulario";
    }

    @PostMapping
    public String guardar(@ModelAttribute("actividad") Actividad actividad) {
        actividadServicio.guardar(actividad);
        return "redirect:/actividades";
    }

    @GetMapping ("/eliminar")
    public String eliminar(@PathVariable Long id) {
        actividadServicio.eliminar(id);
        return "redirect:/actividades";
    }
}
