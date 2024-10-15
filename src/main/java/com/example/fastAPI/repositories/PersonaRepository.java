package com.example.fastAPI.repositories;

import com.example.fastAPI.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

}