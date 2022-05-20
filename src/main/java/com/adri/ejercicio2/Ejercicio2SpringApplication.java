package com.adri.ejercicio2;

import com.adri.ejercicio2.services.Ciudad;
import com.adri.ejercicio2.services.Persona;
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
	public List<Ciudad> listaCiudades(){
		return new ArrayList<Ciudad>();
	}

	@Bean("bean1")
	public Persona personaBean1(){
		return Persona.builder().nombre("bean1").build();
	}

	@Bean("bean2")
	public Persona personaBean2(){
		return Persona.builder().nombre("bean2").build();
	}
	@Bean("bean3")
	public Persona personaBean3(){
		return Persona.builder().nombre("bean3").build();
	}

}
