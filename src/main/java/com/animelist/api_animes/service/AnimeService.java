package com.animelist.api_animes.service;

import com.animelist.api_animes.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Component
public class AnimeService {
    private List<Anime> animes = List.of(new Anime(1L, "One piece"), new Anime(2L, "HxH"));

    public List<Anime> listAll(){
        return animes;
    }

    public Anime findById(long id){
        return animes.stream().filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime ID not Found"));
    }

}
