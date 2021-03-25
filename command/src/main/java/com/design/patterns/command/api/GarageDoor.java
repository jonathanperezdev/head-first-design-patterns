package com.design.patterns.command.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GarageDoor {
    public void up(){
        log.info("Door up");
    }

    public void down(){
        log.info("Door down");
    }
}
