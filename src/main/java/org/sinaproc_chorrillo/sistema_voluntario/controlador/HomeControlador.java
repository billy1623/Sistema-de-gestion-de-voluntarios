package org.sinaproc_chorrillo.sistema_voluntario.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class HomeControlador {

        @GetMapping("/")
        public String home() {
            return "index";  // carga el archivo index.html
        }
    }
// Este controlador maneja la ruta raíz ("/") y devuelve el archivo index.html cuando se accede a la aplicación.



