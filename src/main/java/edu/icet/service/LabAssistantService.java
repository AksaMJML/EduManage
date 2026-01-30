package edu.icet.service;

import edu.icet.model.dto.LabAssistantDTO;

import java.util.List;

public interface LabAssistantService {
    void addLabAssistant(LabAssistantDTO labAssistantDTO);
    void updateLabAssistant(LabAssistantDTO labAssistantDTO);
    void deleteLabAssistant(Integer id);
    LabAssistantDTO searchById(Integer id);
    List<LabAssistantDTO> getAll();
}
