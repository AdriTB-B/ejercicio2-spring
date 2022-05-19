package com.adri.ejercicio2;

import com.adri.ejercicio2.services.Persona;
import com.adri.ejercicio2.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador2 {
    @Autowired
    PersonaService personaService;

    @GetMapping("/controlador2/getPersona")
    public Persona getPersona(){
        Persona persona1 = personaService.getPersona();
        persona1.setEdad(persona1.getEdad() * 2);
        System.out.println(personaService);
        return personaService.getPersona();
    }
}
