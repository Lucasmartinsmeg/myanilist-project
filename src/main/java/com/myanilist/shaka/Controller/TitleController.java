package com.myanilist.shaka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myanilist.shaka.Repository.TitleRepository;

@RestController
@RequestMapping("/titles")
public class TitleController {
    @Autowired
    private TitleRepository titleRepository;


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<TitleResponseDTO> getAllTitles() {
        List<TitleResponseDTO> getTitleList = titleRepository.findAll().stream().map(title -> new TitleResponseDTO()).toList();
        return getTitleList;
    }
}
