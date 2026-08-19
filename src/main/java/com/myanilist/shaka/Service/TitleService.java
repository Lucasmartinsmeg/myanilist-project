package com.myanilist.shaka.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.myanilist.shaka.Model.Title;
import com.myanilist.shaka.Repository.TitleRepository;

public class TitleService {
    @Autowired
    private final TitleRepository repository;

    public TitleService (TitleRepository repository){
        this.repository = repository;
    }

    public List<Title> getTitles(){
        return repository.findAll();
    }
}
