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
		return new Persona("bean1", 0, null);
	}

	@Bean("bean2")
	public Persona personaBean2(){
		return new Persona("bean2", 0, null);
	}
	@Bean("bean3")
	public Persona personaBean3(){
		return new Persona("bean3", 0, null);
	}

}
