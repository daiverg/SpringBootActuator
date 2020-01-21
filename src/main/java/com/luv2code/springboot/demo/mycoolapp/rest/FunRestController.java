package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return coachName+" "+teamName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello wolrd time is : " + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run Hard for a 5k$$$$$$$$$";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "today is your lucky day";
    }

}
