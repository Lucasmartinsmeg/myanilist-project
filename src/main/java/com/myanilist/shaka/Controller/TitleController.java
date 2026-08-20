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

    //Aqui estou pegando o serviço de título para poder usar no controlador
    private final TitleService titleService;

    //Aqui estou colocando o serviço no construtor do controlador para poder usar ele nos métodos do controlador
    public TitleController(TitleService service) {
        this.titleService = service;
    }

    //Meu @Getmapping agora não fica mais no topo, porque ele está dentro do método que vai retornar a lista de títulos.
    @CrossOrigin(origins = "*", allowedHeaders = "*") // end point para o front-end acessar a API sem problemas de CORS.
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
