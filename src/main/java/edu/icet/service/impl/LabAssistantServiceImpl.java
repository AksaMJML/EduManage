package edu.icet.service.impl;

import edu.icet.model.dto.LabAssistantDTO;
import edu.icet.model.entity.LabAssistantEntity;
import edu.icet.repositery.LabAssistantRepositery;
import edu.icet.service.LabAssistantService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class LabAssistantServiceImpl implements LabAssistantService {

    final LabAssistantRepositery repositery;
    final ModelMapper mapper;
    @Override
    public void addLabAssistant(LabAssistantDTO labAssistantDTO) {
        repositery.save(mapper.map(labAssistantDTO , LabAssistantEntity.class));
    }

    @Override
    public void updateLabAssistant(LabAssistantDTO labAssistantDTO) {
        repositery.save(mapper.map(labAssistantDTO , LabAssistantEntity.class));
    }

    @Override
    public void deleteLabAssistant(Integer id) {

    }

    @Override
    public LabAssistantDTO searchById(Integer id) {
        return null;
    }

    @Override
    public List<LabAssistantDTO> getAll() {
        return List.of();
    }
}
