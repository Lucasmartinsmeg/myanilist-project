package com.myanilist.shaka.ResponseDTO;
import com.myanilist.shaka.Model.Title;

public record TitleResponseDTO(Long id, String title, String image) {
    public TitleResponseDTO(Title title) {
    this(title.getId(), title.getTitle(), title.getImage());
    }
}
