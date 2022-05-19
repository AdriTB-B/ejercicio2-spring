package com.adri.ejercicio2.services;

import org.springframework.stereotype.Service;

@Service
public interface PersonaService {
    void setPersona(Persona persona);

    Persona getPersona();
}
