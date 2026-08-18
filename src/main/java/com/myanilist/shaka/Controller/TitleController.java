package com.myanilist.shaka.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/titles")
public class TitleController {

    @GetMapping
    public String listar() {
        return "Olá do REST Controller";
    }
}
