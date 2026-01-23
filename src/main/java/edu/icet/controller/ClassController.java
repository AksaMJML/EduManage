package edu.icet.controller;

import edu.icet.model.dto.ClassDTO;
import edu.icet.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
@RequiredArgsConstructor
public class ClassController {

    final ClassService service;

    @PostMapping("/add")
    public void addClass(@RequestBody ClassDTO classDTO){
        service.addClass(classDTO);
    }

    @PutMapping("/update")
    public void updateClasss(@RequestBody ClassDTO classDTO){
        service.updateClass(classDTO);
    }

    @GetMapping("/search-by-id/{id}")
    public ClassDTO searchById(@PathVariable Integer id){
        return service.searchById(id);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteById(@PathVariable Integer id){
        service.deleteClass(id);
    }

    @GetMapping("/get-all")
    public List<ClassDTO> getAll(){
        return service.getAllClasses();
    }
}
