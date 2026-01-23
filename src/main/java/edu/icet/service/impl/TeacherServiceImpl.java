package edu.icet.service.impl;

import edu.icet.model.dto.TeacherDTO;
import edu.icet.service.TeacherService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    @Override
    public void addTeacher(TeacherDTO teacherDTO) {

    }

    @Override
    public void updateTeacher(TeacherDTO teacherDTO) {

    }

    @Override
    public void deleteTeacher(Integer id) {

    }

    @Override
    public TeacherDTO searchById(Integer id) {
        return null;
    }

    @Override
    public List<TeacherDTO> getAllTeachers() {
        return List.of();
    }
}
