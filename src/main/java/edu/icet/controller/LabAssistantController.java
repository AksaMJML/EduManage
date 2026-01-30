package edu.icet.controller;

import edu.icet.model.dto.LabAssistantDTO;
import edu.icet.service.LabAssistantService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lab-assistants")
@RequiredArgsConstructor
@Tag(name = "Lab Assistant Controller", description = "APIs for managing lab assistants")
public class LabAssistantController {

    final LabAssistantService service;

    @PostMapping("/add")
    public void addLabAssistant(LabAssistantDTO labAssistantDTO) {
        service.addLabAssistant(labAssistantDTO);
    }

    @PutMapping("/update")
    public void updateLabAssistant(LabAssistantDTO labAssistantDTO) {
        service.updateLabAssistant(labAssistantDTO);
    }
}
