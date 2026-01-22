package edu.icet.service;

import edu.icet.model.dto.SchoolDTO;

import java.util.List;

public interface SchoolService {
    void registerSchool(SchoolDTO schoolDTO);
    void updateSchool(SchoolDTO schoolDTO);
    void deleteById(String id);
    SchoolDTO searchById(String id);
    List<SchoolDTO> getAllSchools();
}
