package com.animelist.api_animes.repository;

import com.animelist.api_animes.domain.Anime;
import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}

