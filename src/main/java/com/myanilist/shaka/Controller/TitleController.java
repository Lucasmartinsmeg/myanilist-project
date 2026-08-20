package com.myanilist.shaka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.myanilist.shaka.Repository.TitleRepository;
import com.myanilist.shaka.ResponseDTO.TitleResponseDTO;
import com.myanilist.shaka.Service.TitleService;

@RestController
public class TitleController {

    private final TitleService titleService;

    public TitleController(TitleService service) {
        this.titleService = service;
    }

    @GetMapping("/titles")
    public List<TitleResponseDTO> getTitles(){
        return titleService.getTitles().stream().map(TitleResponseDTO::new).toList();
    }
    
    /*@CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<TitleResponseDTO> getAllTitles() {
        List<TitleResponseDTO> getTitleList = titleRepository.findAll().stream().map(TitleResponseDTO::new).toList();
        return getTitleList;
    }*/
}
