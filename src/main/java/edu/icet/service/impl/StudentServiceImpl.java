package edu.icet.service.impl;

import edu.icet.model.dto.StudentDTO;
import edu.icet.model.entity.StudentEntity;
import edu.icet.repositery.StudentRepositery;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    final StudentRepositery studentRepositery;

    final ModelMapper mapper;

    @Override
    public void addStudent(StudentDTO studentDTO) {
        StudentEntity stdEntity = mapper.map(studentDTO, StudentEntity.class);
        studentRepositery.save(stdEntity);
    }

    @Override
    public void updateStudent(StudentDTO studentDTO) {
        studentRepositery.save(mapper.map(studentDTO, StudentEntity.class));
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepositery.deleteById(id);
    }

    @Override
    public StudentDTO searchById(Integer id) {
        StudentEntity studentEntity = studentRepositery.findById(id).get();
        StudentDTO studentDTO = mapper.map(studentEntity, StudentDTO.class);
        return studentDTO;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<StudentEntity> studentEntities = studentRepositery.findAll();
        ArrayList<StudentDTO> studentDTOArrayList = new ArrayList<>();
        studentEntities.forEach(studentEntity -> {
            StudentDTO studentDTO = mapper.map(studentEntity, StudentDTO.class);
            studentDTOArrayList.add(studentDTO);
        });
        return studentDTOArrayList;
    }
}
