package com.platzi.platzi_market.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {

    @GetMapping ("/hola")
    public String saludar() {
        return "Testing de un controlador!";

        // Si ejecuto el servidor puedo ver el output por el puerto 8080
        // http://localhost:8080/saludar/hola

        // Despues de cambiar el application.properties la ruta ha cambiado.
        // http://localhost:8090/platzi-market/api/saludar/hola
    }



}
