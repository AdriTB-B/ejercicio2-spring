package com.adri.ejercicio2.services;

import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Builder
@Data
public class Persona {
    private String nombre;
    private int edad;
    private String poblacion;
}
