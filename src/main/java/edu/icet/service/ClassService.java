package edu.icet.service;

import edu.icet.model.dto.ClassDTO;

import java.util.List;

public interface ClassService {
    void addClass(ClassDTO classDTO);
    void updateClass(ClassDTO classDTO);
    void deleteClass(Integer id);
    ClassDTO searchById(Integer id);
    List<ClassDTO> getAllClasses();
}
