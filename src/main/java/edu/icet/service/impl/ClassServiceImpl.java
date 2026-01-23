package edu.icet.service.impl;

import edu.icet.model.dto.ClassDTO;
import edu.icet.service.ClassService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


public class ClassServiceImpl implements ClassService {


    @Override
    public void addClass(ClassDTO classDTO) {

    }

    @Override
    public void updateClass(ClassDTO classDTO) {

    }

    @Override
    public void deleteClass(Integer id) {

    }

    @Override
    public ClassDTO searchById(Integer id) {
        return null;
    }

    @Override
    public List<ClassDTO> getAllClasses() {
        return List.of();
    }
}
