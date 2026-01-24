package edu.icet.controller;

import edu.icet.model.dto.SubjectDTO;
import edu.icet.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
@RequiredArgsConstructor
public class SubjectController {

    final SubjectService service;

    @PostMapping("/add")
    public void addSubject(SubjectDTO subjectDTO){
        service.addSubject(subjectDTO);
    }

    @PutMapping("/update")
    public void updateSubject(SubjectDTO subjectDTO){
        service.updateSubject(subjectDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteSubject(String id){
        service.deleteSubject(id);
    }

    @GetMapping("/search-by-id/{id}")
    public SubjectDTO searchById(String id){
        return service.searchById(id);
    }

    @GetMapping("/get-all")
    public List<SubjectDTO> geAllSubjects(){
        return service.getAllSubjects();
    }
}
