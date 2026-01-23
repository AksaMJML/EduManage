package edu.icet.controller;

import edu.icet.model.dto.SchoolDTO;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schools")
@RequiredArgsConstructor
public class SchoolController {

    final SchoolService service;

    @PostMapping("/add")
    public void addSchool(@RequestBody SchoolDTO schoolDTO){
        service.registerSchool(schoolDTO);
    }

    @GetMapping("/search-by-id/{id}")
    public SchoolDTO searchById(@PathVariable String id){
        return service.searchById(id);
    }

    @PutMapping("/update")
    public void updateSchool(@RequestBody SchoolDTO schoolDTO){
        service.updateSchool(schoolDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteById(@PathVariable String id){
        service.deleteById(id);
    }

    @GetMapping("/get-all")
    public List<SchoolDTO> getAllSchools(){
        return service.getAllSchools();
    }


}
