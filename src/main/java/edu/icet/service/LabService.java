package edu.icet.service;

import edu.icet.model.dto.LabDTO;

import java.util.List;

public interface LabService {
    void addLab(LabDTO labDTO);
    void updateLab(LabDTO labDTO);
    void deleteLab(Integer id);
    LabDTO searchById(Integer id);
    List<LabDTO> getAllLabs();
}
