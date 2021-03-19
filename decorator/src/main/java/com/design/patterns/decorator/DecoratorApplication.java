package com.design.patterns.decorator;

import com.design.patterns.decorator.business.Beverage;
import com.design.patterns.decorator.business.impl.HouseBlend;
import com.design.patterns.decorator.decorators.impl.Mocha;
import com.design.patterns.decorator.decorators.impl.Soy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DecoratorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DecoratorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Beverage beverage1 = new HouseBlend();

		beverage1 = new Soy(beverage1);
		beverage1 = new Mocha(beverage1);
		beverage1 = new Mocha(beverage1);

		log.info("Your beverage is "+beverage1.getDescription()+" cost "+beverage1.cost());
	}
}
