package com.adri.ejercicio2;

import com.adri.ejercicio2.services.Persona;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @GetMapping("/controlador/bean/{bean}")
    public Persona getBeanPersona(@PathVariable("bean") String nombreBean){

        return (Persona) Ejercicio2SpringApplication.cac.getBean(nombreBean);
    }
}
