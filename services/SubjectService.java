package com.example.notasjakarta.services;

import com.example.notasjakarta.domain.model.Subject;
import com.example.notasjakarta.mapping.dtos.SubjectDto;

import java.util.List;

public interface SubjectService {
    List<SubjectDto> listar();

    Subject porId(Long id);

    void guardar(Subject t);

    void eliminar(Long id);
}
