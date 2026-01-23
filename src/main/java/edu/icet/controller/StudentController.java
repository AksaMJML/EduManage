package edu.icet.controller;

import edu.icet.model.dto.StudentDTO;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    //@Autowired
    final StudentService studentService;

    @PostMapping("/add")
    public void addStudent(@RequestBody StudentDTO studentDTO){
        studentService.addStudent(studentDTO);
    }

    @PutMapping("/update")
    public void updateStudent(@RequestBody StudentDTO studentDTO){
        studentService.updateStudent(studentDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteByID(@PathVariable Integer id){
        studentService.deleteStudent(id);
    }

    @GetMapping("/search-by-id/{id}")
    public StudentDTO serachByID(@PathVariable Integer id){
        return studentService.searchById(id);
    }

    @GetMapping("/get-all")
    public List<StudentDTO> getAll(){
        return studentService.getAllStudents();
    }

}
