package com.nttdata.proyectobootcampjpa;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoBootcampjpaApplication implements CommandLineRunner {

	private final Logger LOGGER = LoggerFactory.getLogger("start");

	public static void main(String[] args) {
		// SpringApplication.run(ProyectoBootcampjpaApplication.class, args);
        SpringApplication.run(ProyectoBootcampjpaApplication.class, new String[]{"--server.port=8444"});
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.trace("LOGGER TRACE");
		LOGGER.debug("LOGGER DEBUG");
		LOGGER.info("LOGGER INFO");
		LOGGER.warn("LOGGER WARN");
		LOGGER.error("LOGGER ERROR");
	}
}
