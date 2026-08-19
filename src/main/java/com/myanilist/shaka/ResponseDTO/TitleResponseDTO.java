package com.myanilist.shaka.ResponseDTO;

public record TitleResponseDTO(Long id, String title, String image) {
    this(title.getId(), title.getTitle(), title.getImage());
}
