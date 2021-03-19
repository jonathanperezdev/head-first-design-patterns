package com.design.patterns.observer;

import com.design.patterns.observer.business.subjects.WeatherData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverApplication implements CommandLineRunner {

	@Autowired
	private WeatherData weatherData;

	public static void main(String[] args) {
		SpringApplication.run(ObserverApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 39);
		weatherData.setMeasurements(90, 85, 25.4f);
	}
}
