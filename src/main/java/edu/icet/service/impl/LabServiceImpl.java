package edu.icet.service.impl;

import edu.icet.model.dto.LabDTO;
import edu.icet.model.entity.LabEntity;
import edu.icet.repositery.LabRepositery;
import edu.icet.service.LabService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class LabServiceImpl implements LabService {

    final LabRepositery repositery;
    final ModelMapper mapper;

    @Override
    public void addLab(LabDTO labDTO) {
        LabEntity labEntity = mapper.map(labDTO, LabEntity.class);
        repositery.save(labEntity);

        //repositery.save(mapper.map(labDTO, LabEntity.class));
    }

    @Override
    public void updateLab(LabDTO labDTO) {
        repositery.save(mapper.map(labDTO , LabEntity.class));
    }

    @Override
    public void deleteLab(Integer id) {
        repositery.deleteById(id);
    }

    @Override
    public LabDTO searchById(Integer id) {
        LabEntity labEntity = repositery.findById(id).get();
        LabDTO labDTO = mapper.map(labEntity, LabDTO.class);
        return labDTO;
    }

    @Override
    public List<LabDTO> getAllLabs() {
        return List.of();
    }
}
