package com.myanilist.shaka.RequestDTO;
import com.myanilist.shaka.Model.Title;

/*Criando um record para receber os dados do titulo e da imagem e
estou pedindo para que meu construtor recebar o objeto Title,
Consequentemente, estou chamando o metodo getter que está injetado na minha classe Title*/
public record TitleRequestDTO(String title, String image){
    public TitleRequestDTO(Title title){
        this(title.getTitle(), title.getImage());
    }
}