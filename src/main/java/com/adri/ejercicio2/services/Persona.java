package com.adri.ejercicio2.services;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class Persona {
    private String nombre;
    private int edad;
    private String poblacion;
}
