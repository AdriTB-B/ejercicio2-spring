package com.adri.ejercicio2.services;

import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public record Persona(String nombre, int edad, String poblacion) { }

