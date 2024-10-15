package com.example.fastAPI.repositories;

import com.example.fastAPI.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long>{
}
