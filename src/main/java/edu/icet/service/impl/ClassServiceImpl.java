package edu.icet.service.impl;

import edu.icet.model.dto.ClassDTO;
import edu.icet.model.entity.ClassEntity;
import edu.icet.repositery.ClassRepositery;
import edu.icet.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ClassServiceImpl implements ClassService {

    final ClassRepositery repositery;
    final ModelMapper mapper;

    @Override
    public void addClass(ClassDTO classDTO) {
        repositery.save(mapper.map(classDTO, ClassEntity.class));
    }

    @Override
    public void updateClass(ClassDTO classDTO) {
        repositery.save(mapper.map(classDTO, ClassEntity.class));
    }

    @Override
    public void deleteClass(Integer id) {
        repositery.deleteById(id);
    }

    @Override
    public ClassDTO searchById(Integer id) {
        ClassEntity classEntity = repositery.findById(id).get();
        ClassDTO classDTO = mapper.map(classEntity, ClassDTO.class);
        return classDTO;
    }

    @Override
    public List<ClassDTO> getAllClasses() {
        List<ClassEntity> classEntities = repositery.findAll();
        ArrayList<ClassDTO> classDTOArrayList = new ArrayList<>();
        classEntities.forEach(classEntity -> {
            ClassDTO classDTO = mapper.map(classEntity, ClassDTO.class);
            classDTOArrayList.add(classDTO);
        });
        return classDTOArrayList;
    }
}
