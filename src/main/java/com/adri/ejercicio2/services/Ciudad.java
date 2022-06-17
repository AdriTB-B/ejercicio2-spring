package com.adri.ejercicio2.services;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;


public record Ciudad (String nombre, int numeroHabitantes) {}
