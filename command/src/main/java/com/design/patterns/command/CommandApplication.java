package com.design.patterns.command;

import com.design.patterns.command.business.RemoteControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CommandApplication implements CommandLineRunner {
	@Autowired
	private RemoteControl remoteControl;

	public static void main(String[] args) {
		SpringApplication.run(CommandApplication.class, args);
	}

	@Override
	public void run(String... args) {
		remoteControl.executeCommands(Arrays.asList("LightOn",
				"LightOff",
				"GarageDoorUp",
				"GarageDoorDown"));
	}
}
