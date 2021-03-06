package com.adri.ejercicio2;

import com.adri.ejercicio2.services.Ciudad;
import com.adri.ejercicio2.services.Persona;
import com.adri.ejercicio2.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class Controlador1 {

    @Autowired
    PersonaService personaService;

    @GetMapping("/controlador1/addPersona")
    public Persona addPersona(@RequestHeader Map<String, String> headers) {
        Persona persona1 = new Persona(
                headers.get("nombre"),
                Integer.parseInt(headers.get("edad")),
                headers.get("poblacion")
        );
        personaService.setPersona(persona1);
        System.out.println(personaService);
        return persona1;
    }

    @PostMapping("/controlador1/addCiudad")
    public Ciudad addCiudad(@RequestBody Ciudad ciudad){
        System.out.println(Ejercicio2SpringApplication.cac.getBean("listaCiudades"));
        List<Ciudad> listaBean = (List<Ciudad>) Ejercicio2SpringApplication.cac.getBean("listaCiudades");
        listaBean.add(ciudad);
        System.out.println(Ejercicio2SpringApplication.cac.getBean("listaCiudades"));
        return ciudad;
    }

}
