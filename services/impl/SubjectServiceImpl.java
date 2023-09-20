package com.example.notasjakarta.services.impl;

import com.example.notasjakarta.domain.model.Subject;
import com.example.notasjakarta.mapping.dtos.SubjectDto;
import com.example.notasjakarta.repositories.impl.SubjectRepositoryLogicImpl;
import com.example.notasjakarta.services.SubjectService;

import java.util.List;

public class SubjectServiceImpl implements SubjectService {
    private final SubjectRepositoryLogicImpl repository;

    public SubjectServiceImpl(SubjectRepositoryLogicImpl repository) {
        this.repository = repository;
    }
    @Override
    public List<SubjectDto> listar() {
        return repository.listar();
    }

    @Override
    public Subject porId(Long id) {
        return repository.porId(id);
    }

    @Override
    public void guardar(Subject t) {
        repository.guardar(t);
    }

    @Override
    public void eliminar(Long id) {
        repository.eliminar(id);
    }
}
