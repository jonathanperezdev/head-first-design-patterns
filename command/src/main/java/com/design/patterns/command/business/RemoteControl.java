package com.design.patterns.command.business;

import com.design.patterns.command.api.GarageDoor;
import com.design.patterns.command.api.Light;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class RemoteControl {

    @Autowired
    private Light light;

    @Autowired
    private GarageDoor garageDoor;

    private Map<String, Command> commnds = new HashMap<>();

    @PostConstruct
    public void init() {
        this.commnds.put("LightOn", light::on);
        this.commnds.put("LightOff", light::off);
        this.commnds.put("GarageDoorUp", garageDoor::up);
        this.commnds.put("GarageDoorDown", garageDoor::down);

    }

    public void executeCommands(List<String> commandNames){
        commandNames.forEach(name -> this.commnds.get(name).execute());
    }
}
