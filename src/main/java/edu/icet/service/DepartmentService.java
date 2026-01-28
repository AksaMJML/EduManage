package edu.icet.service;

import edu.icet.model.dto.DepartmentDTO;

import java.util.List;

public interface DepartmentService {
    void addDepartment(DepartmentDTO departmentDTO);
    void updateDepartment(DepartmentDTO departmentDTO);
    void deleteDepartment(Integer id);
    DepartmentDTO searchById(Integer id);
    List<DepartmentDTO> getAllDepartments();
}
