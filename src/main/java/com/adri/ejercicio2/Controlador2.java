package com.adri.ejercicio2;

import com.adri.ejercicio2.services.Persona;
import com.adri.ejercicio2.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Controller
public class Controlador2 {
    @Autowired
    PersonaService personaService;

    @GetMapping("/controlador2/getPersona")
    public ResponseEntity<Persona> getPersona(){
        Persona persona1 = personaService.getPersona();
        persona1.setEdad(persona1.getEdad() * 2);
        return new ResponseEntity<>(personaService.getPersona(), HttpStatus.OK);
    }
}
