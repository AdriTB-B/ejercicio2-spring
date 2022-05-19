package com.adri.ejercicio2;

import com.adri.ejercicio2.services.Ciudad;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Ejercicio2SpringApplication {

	public  static ConfigurableApplicationContext cac;

	public static void main(String[] args) {
		cac = SpringApplication.run(Ejercicio2SpringApplication.class, args);
	}

	@Bean
	@Qualifier("listaCiudades")
	public List<Ciudad> listaCiudades(){
		return new ArrayList<Ciudad>();
	}

}
