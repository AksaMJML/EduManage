package edu.icet.service.impl;

import edu.icet.model.dto.SubjectDTO;
import edu.icet.model.entity.SubjectEntity;
import edu.icet.repositery.SubjectRepositery;
import edu.icet.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SubjectServiceImpl implements SubjectService {

    final SubjectRepositery repositery;
    final ModelMapper mapper;

    @Override
    public void addSubject(SubjectDTO subjectDTO) {
        repositery.save(mapper.map(subjectDTO, SubjectEntity.class));
    }

    @Override
    public void updateSubject(SubjectDTO subjectDTO) {
        repositery.save(mapper.map(subjectDTO, SubjectEntity.class));
    }

    @Override
    public void deleteSubject(String id) {
        repositery.deleteById(id);
    }

    @Override
    public SubjectDTO searchById(String id) {
        SubjectEntity subjectEntity = repositery.findById(id).get();
        SubjectDTO subjectDTO = mapper.map(subjectEntity, SubjectDTO.class);
        return subjectDTO;
    }

    @Override
    public List<SubjectDTO> getAllSubjects() {
        List<SubjectEntity> subjectEntities = repositery.findAll();
        ArrayList<SubjectDTO> subjectDTOArrayList = new ArrayList<>();
        subjectEntities.forEach(subjectEntity -> {
            SubjectDTO subjectDTO = mapper.map(subjectEntity, SubjectDTO.class);
            subjectDTOArrayList.add(subjectDTO);
        });
        return subjectDTOArrayList;
    }
}
