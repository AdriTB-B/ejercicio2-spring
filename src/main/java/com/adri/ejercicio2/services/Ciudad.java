package com.adri.ejercicio2.services;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Builder
public class Ciudad {
    private String nombre;
    private int numeroHabitantes;
}
