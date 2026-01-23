package edu.icet.controller;

import edu.icet.model.dto.StudentDTO;
import edu.icet.model.dto.TeacherDTO;
import edu.icet.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@RequiredArgsConstructor
public class TeacherController {

    final TeacherService service;

    @PostMapping("/add")
    public void addTeacher(@RequestBody TeacherDTO teacherDTO) {
        service.addTeacher(teacherDTO);
    }

    @GetMapping("/search-by-id/{id}")
    public TeacherDTO searchById(@PathVariable Integer id) {
        return service.searchById(id);
    }

    @PutMapping("/update")
    public void updateTeacher(@RequestBody TeacherDTO teacherDTO) {
        service.updateTeacher(teacherDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteById(@PathVariable Integer id) {
        service.deleteTeacher(id);
    }

    @GetMapping("/get-all")
    public List<TeacherDTO> getAllTeachers() {
        return service.getAllTeachers();
    }
}
