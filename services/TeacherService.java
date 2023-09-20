package com.example.notasjakarta.services;

import com.example.notasjakarta.domain.model.Teacher;
import com.example.notasjakarta.mapping.dtos.TeacherDto;

import java.util.List;

public interface TeacherService {
    List<TeacherDto> listar();

    Teacher porId(Long id);

    void guardar(Teacher t);

    void eliminar(Long id);
}
