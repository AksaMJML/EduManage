package edu.icet.service.impl;

import edu.icet.model.dto.DepartmentDTO;
import edu.icet.model.entity.DepartmentEntity;
import edu.icet.repositery.DepartmentRepositery;
import edu.icet.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {

    final DepartmentRepositery repositery;
    final ModelMapper mapper;
    @Override
    public void addDepartment(DepartmentDTO departmentDTO) {
        repositery.save(mapper.map(departmentDTO , DepartmentEntity.class));
    }

    @Override
    public void updateDepartment(DepartmentDTO departmentDTO) {
        repositery.save(mapper.map(departmentDTO , DepartmentEntity.class));
    }

    @Override
    public void deleteDepartment(Integer id) {
        repositery.deleteById(id);
    }

    @Override
    public DepartmentDTO searchById(Integer id) {
        DepartmentEntity departmentEntity = repositery.findById(id).get();
        DepartmentDTO departmentDto = mapper.map(departmentEntity, DepartmentDTO.class);
        return departmentDto;
    }

    @Override
    public List<DepartmentDTO> getAllDepartments() {
        List<DepartmentEntity> departmentEntities = repositery.findAll();
        ArrayList<DepartmentDTO> departmentDTOArrayList = new ArrayList<>();
        departmentEntities.forEach(departmentEntity -> {
            DepartmentDTO departmentDTO = mapper.map(departmentEntity, DepartmentDTO.class);
            departmentDTOArrayList.add(departmentDTO);
        });
        return departmentDTOArrayList;
    }
}
