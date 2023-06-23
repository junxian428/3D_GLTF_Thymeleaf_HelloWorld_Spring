package com.example.threed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class ThreedApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThreedApplication.class, args);
	}


    @GetMapping("/")
    public String home(Model model) {
        // Add data to the model to be used in the template
        model.addAttribute("message", "England is my City!");

        // Return the name of the Thymeleaf template
        return "home";
    }
}
