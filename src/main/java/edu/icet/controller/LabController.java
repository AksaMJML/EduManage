package edu.icet.controller;

import edu.icet.model.dto.LabDTO;
import edu.icet.service.LabService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
}
