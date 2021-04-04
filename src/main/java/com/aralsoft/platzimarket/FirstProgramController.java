package com.aralsoft.platzimarket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/homepage")
public class FirstProgramController {


    @GetMapping("/first")
    public String saludar() {
        return "AralSoft , siempre un paso adelante 👍";
    }
}
