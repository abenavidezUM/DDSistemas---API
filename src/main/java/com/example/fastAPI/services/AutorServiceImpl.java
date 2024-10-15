package com.example.fastAPI.services;

import com.example.fastAPI.entities.Autor;
import com.example.fastAPI.repositories.AutorRepository;
import com.example.fastAPI.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{
    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
