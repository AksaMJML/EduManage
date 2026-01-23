package edu.icet.service.impl;

import edu.icet.model.dto.StudentDTO;
import edu.icet.model.dto.TeacherDTO;
import edu.icet.model.entity.StudentEntity;
import edu.icet.model.entity.TeacherEntity;
import edu.icet.repositery.TeacherRepositery;
import edu.icet.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TeacherServiceImpl implements TeacherService {

    final TeacherRepositery repositery;
    final ModelMapper mapper;

    @Override
    public void addTeacher(TeacherDTO teacherDTO) {
        repositery.save(mapper.map(teacherDTO, TeacherEntity.class));
    }

    @Override
    public void updateTeacher(TeacherDTO teacherDTO) {
        repositery.save(mapper.map(teacherDTO, TeacherEntity.class));
    }

    @Override
    public void deleteTeacher(Integer id) {
        repositery.deleteById(id);
    }

    @Override
    public TeacherDTO searchById(Integer id) {
        TeacherEntity teacherEntity = repositery.findById(id).get();
        TeacherDTO teacherDTO = mapper.map(teacherEntity, TeacherDTO.class);
        return teacherDTO;
    }

    @Override
    public List<TeacherDTO> getAllTeachers() {
        List<TeacherEntity> teacherEntities = repositery.findAll();
        ArrayList<TeacherDTO> teacherDTOArrayList = new ArrayList<>();
        teacherEntities.forEach(teacherEntity -> {
            TeacherDTO teacherDTO = mapper.map(repositery, TeacherDTO.class);
            teacherDTOArrayList.add(teacherDTO);
        });
        return teacherDTOArrayList;
    }
}
