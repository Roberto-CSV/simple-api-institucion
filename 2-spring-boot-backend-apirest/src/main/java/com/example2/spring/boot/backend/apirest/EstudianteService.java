package com.example2.spring.boot.backend.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EstudianteService implements IEstudianteService {
    @Autowired
    private  IEstudianteRepository estudianteRepository;
    @Override
    @Transactional(readOnly = true)
    public List<EstudianteEntity> findAll() {
        return (List<EstudianteEntity>) this.estudianteRepository.findAll();
    }
}
