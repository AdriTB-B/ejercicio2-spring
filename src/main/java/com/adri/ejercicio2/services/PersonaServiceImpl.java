package com.adri.ejercicio2.services;

import org.springframework.stereotype.Component;

@Component
public class PersonaServiceImpl implements PersonaService{
    private Persona persona;

    @Override
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public Persona getPersona() {
        return persona;
    }
}
