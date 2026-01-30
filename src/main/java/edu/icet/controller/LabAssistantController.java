package edu.icet.controller;

import edu.icet.model.dto.LabAssistantDTO;
import edu.icet.model.dto.LabDTO;
import edu.icet.service.LabAssistantService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lab-assistants")
@RequiredArgsConstructor
@Tag(name = "Lab Assistant Controller", description = "APIs for managing lab assistants")
public class LabAssistantController {

    final LabAssistantService service;

    @PostMapping("/add")
    public void addLabAssistant(@RequestBody LabAssistantDTO labAssistantDTO) {
        service.addLabAssistant(labAssistantDTO);
    }

    @PutMapping("/update")
    public void updateLabAssistant(@RequestBody LabAssistantDTO labAssistantDTO) {
        service.updateLabAssistant(labAssistantDTO);
    }
    @DeleteMapping("/delete-by-id/{id}")
    public void deleteLabAssistant(@PathVariable Integer id) {
        service.deleteLabAssistant(id);
    }

    @GetMapping("/search-by-id/{id}")
    public LabAssistantDTO searchById(@PathVariable Integer id) {
        return service.searchById(id);
    }

    @GetMapping("/get-all")
    public List<LabAssistantDTO> getAllLabAssistants() {
        return service.getAll();
    }
}
