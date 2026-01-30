package edu.icet.controller;

import edu.icet.model.dto.LabDTO;
import edu.icet.service.LabService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/labs")
@RequiredArgsConstructor
@Tag(name = "Lab Controller", description = "APIs for managing labs")
public class LabController {

    final LabService service;

    @GetMapping("/add")
    public void addLab(LabDTO labDTO){
        service.addLab(labDTO);
    }
}
