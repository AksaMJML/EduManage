package edu.icet.controller;

import edu.icet.service.StudentService;
import edu.icet.service.impl.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class StudentController {

    StudentService studentService;
}
