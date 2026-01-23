package edu.icet.service;

import edu.icet.model.dto.TeacherDTO;

import java.util.List;

public interface TeacherService {
    void addTeacher(TeacherDTO teacherDTO);
    void updateTeacher(TeacherDTO teacherDTO);
    void deleteTeacher(Integer id);
    TeacherDTO searchById(Integer id);
    List<TeacherDTO> getAllTeachers();
}
