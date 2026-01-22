package edu.icet.service;

import edu.icet.model.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    void addStudent(StudentDTO studentDTO);
    void updateStudent(StudentDTO studentDTO);
    void deleteStudent(Integer id);
    StudentDTO searchById(Integer id);
    List<StudentDTO> getAllStudents();
}
