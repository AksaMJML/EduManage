package edu.icet.service;

import edu.icet.model.dto.SubjectDTO;

import java.util.List;

public interface SubjectService {

    void addSubject(SubjectDTO subjectDTO);
    void updateSubject(SubjectDTO subjectDTO);
    void deleteSubject(String id);
    SubjectDTO searchById(String id);
    List<SubjectDTO> getAllSubjects();
}
