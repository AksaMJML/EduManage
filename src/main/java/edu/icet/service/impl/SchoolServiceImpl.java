package edu.icet.service.impl;

import edu.icet.model.dto.SchoolDTO;
import edu.icet.model.entity.SchoolEntity;
import edu.icet.repositery.SchoolRepositery;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SchoolServiceImpl implements SchoolService {

    final SchoolRepositery repositery;
    final ModelMapper mapper;

    @Override
    public void registerSchool(SchoolDTO schoolDTO) {
        repositery.save(mapper.map(schoolDTO, SchoolEntity.class));

    }

    @Override
    public void updateSchool(SchoolDTO schoolDTO) {
        repositery.save(mapper.map(schoolDTO, SchoolEntity.class));
    }

    @Override
    public void deleteById(String id) {
        repositery.deleteById(id);
    }

    @Override
    public SchoolDTO searchById(String id) {
        SchoolEntity schoolEntity = repositery.findById(id).get();
        SchoolDTO schoolDto = mapper.map(schoolEntity, SchoolDTO.class);
        return schoolDto;
    }

    @Override
    public List<SchoolDTO> getAllSchools() {
        List<SchoolEntity> schoolEntities = repositery.findAll();
        ArrayList<SchoolDTO> schoolDTOArrayList = new ArrayList<>();
        schoolEntities.forEach(schoolEntity -> {
            SchoolDTO schoolDTO = mapper.map(schoolEntity, SchoolDTO.class);
            schoolDTOArrayList.add(schoolDTO);
        });
        return schoolDTOArrayList;
    }
}
