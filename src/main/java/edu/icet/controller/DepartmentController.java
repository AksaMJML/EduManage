package edu.icet.controller;

import edu.icet.model.dto.DepartmentDTO;
import edu.icet.service.DepartmentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@RequiredArgsConstructor
@Tag(name = "Department Controller", description = "APIs for managing departments")
public class DepartmentController {

    final DepartmentService service;

    @PostMapping("/add")
    public void addDepartment(@RequestBody DepartmentDTO departmentDTO){
        service.addDepartment(departmentDTO);
    }

    @PutMapping("/update")
    public void updateDepartment(@RequestBody DepartmentDTO departmentDTO){
        service.updateDepartment(departmentDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteById(@PathVariable Integer id){
        service.deleteDepartment(id);
    }
}
