package io.github.belachewhm.centerpoint.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
