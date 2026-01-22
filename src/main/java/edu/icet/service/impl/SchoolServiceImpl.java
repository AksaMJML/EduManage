package edu.icet.service.impl;

import edu.icet.model.dto.SchoolDTO;
import edu.icet.model.entity.SchoolEntity;
import edu.icet.repositery.SchoolRepositery;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;

@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    final SchoolRepositery repositery;
    ModelMapper mapper;

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

    }

    @Override
    public List<SchoolDTO> getAllSchools() {
        return List.of();
    }
}
