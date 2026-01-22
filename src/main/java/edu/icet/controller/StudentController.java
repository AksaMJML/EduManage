package edu.icet.controller;

import edu.icet.model.dto.StudentDTO;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add-student")
    public void addStudent(@RequestBody StudentDTO studentDTO){
        studentService.addStudent(studentDTO);
    }


}
