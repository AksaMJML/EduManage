package edu.icet.service.impl;

import edu.icet.model.dto.StudentDTO;
import edu.icet.model.entity.StudentEntity;
import edu.icet.repositery.StudentRepositery;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

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

    }

    @Override
    public void deleteStudent(Integer id) {

    }

    @Override
    public StudentDTO searchById(Integer id) {
        return null;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        return List.of();
    }
}
