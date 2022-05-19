package com.adri.ejercicio2;

import com.adri.ejercicio2.services.Ciudad;
import com.adri.ejercicio2.services.Persona;
import com.adri.ejercicio2.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class Controlador1 {

    @Autowired
    PersonaService personaService;

    @GetMapping("/controlador1/addPersona")
    public Persona addPersona(@RequestHeader Map<String, String> headers) {
        Persona persona1 = Persona.builder()
                .nombre(headers.get("nombre"))
                .edad(Integer.parseInt(headers.get("edad")))
                .poblacion(headers.get("poblacion"))
                .build();
        personaService.setPersona(persona1);
        System.out.println(personaService);
        return persona1;
    }

    @PostMapping("/controlador1/addCiudad")
    public Ciudad addCiudad(@RequestBody Ciudad ciudad){
        Ejercicio2SpringApplication.cac.getBean("listaCiudades");
        return ciudad;
    }

}
