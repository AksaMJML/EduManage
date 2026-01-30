package edu.icet.controller;

import edu.icet.model.dto.LabDTO;
import edu.icet.service.LabService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/labs")
@RequiredArgsConstructor
@Tag(name = "Lab Controller", description = "APIs for managing labs")
public class LabController {

    final LabService service;

    @PostMapping("/add")
    public void addLab(@RequestBody LabDTO labDTO){
        service.addLab(labDTO);
    }

    @PutMapping("/update")
    public void updateLab(@RequestBody LabDTO labDTO) {
        service.updateLab(labDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteLab(@PathVariable Integer id){
        service.deleteLab(id);
    }

    @GetMapping("/search-by-id/{id}")
    public LabDTO searchById(@PathVariable Integer id) {
        return service.searchById(id);
    }

    @GetMapping("/get-all")
    public List<LabDTO> getAllLabs(){
        return service.getAllLabs();
    }
}
