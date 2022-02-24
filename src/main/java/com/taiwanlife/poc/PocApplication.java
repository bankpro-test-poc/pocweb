package com.taiwanlife.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class PocApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "TaiwanLife POC!!!");
        model.addAttribute("msg", "Welcome to the docker container!");
        return "index";
    }
    
	public static void main(String[] args) {
		SpringApplication.run(PocApplication.class, args);
	}

}
