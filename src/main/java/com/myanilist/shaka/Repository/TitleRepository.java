package com.myanilist.shaka.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myanilist.shaka.Model.Title;

public interface TitleRepository extends JpaRepository<Title, Long>{
    
}
