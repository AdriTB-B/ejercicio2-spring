package com.adri.ejercicio2;

import com.adri.ejercicio2.services.Persona;
import com.adri.ejercicio2.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class Controlador1 {

    @Autowired
    PersonaService personaService;

    @GetMapping("/controlador1/addPersona")
    public ResponseEntity<Persona> addPersona(@RequestHeader Map<String, String> headers) {
        Persona persona1 = Persona.builder()
                .nombre(headers.get("nombre"))
                .edad(Integer.parseInt(headers.get("edad")))
                .poblacion(headers.get("poblacion"))
                .build();
        personaService.setPersona(persona1);
        return new ResponseEntity<>(persona1, HttpStatus.OK);
    }

}
