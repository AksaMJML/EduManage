package edu.icet.service.impl;

import edu.icet.model.dto.SchoolDTO;
import edu.icet.model.entity.SchoolEntity;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;

@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    final SchoolService service;
    ModelMapper mapper;

    @Override
    public void registerSchool(SchoolDTO schoolDTO) {
        SchoolDTO entity = mapper.map(schoolDTO, SchoolEntity.class);
        service.registerSchool(entity);
    }

    @Override
    public void updateSchool(SchoolDTO schoolDTO) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public SchoolDTO searchById(Integer id) {
        return null;
    }

    @Override
    public List<SchoolDTO> getAllSchools() {
        return List.of();
    }
}
