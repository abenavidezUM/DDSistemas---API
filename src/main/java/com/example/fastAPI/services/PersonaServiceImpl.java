package com.example.fastAPI.services;

import com.example.fastAPI.repositories.BaseRepository;
import com.example.fastAPI.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.fastAPI.entities.Persona;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository ) {
        super(baseRepository);
    }
}