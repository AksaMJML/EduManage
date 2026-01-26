package edu.icet.service.impl;

import edu.icet.model.dto.PrefectsDTO;
import edu.icet.model.entity.PrefectEntity;
import edu.icet.repositery.PrefectRepositery;
import edu.icet.service.PrefectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PreferctServiceImpl implements PrefectService {

    final PrefectRepositery repositery;
    final ModelMapper mapper;
    @Override
    public void addPrefect(PrefectsDTO prefectsDTO) {
        repositery.save(mapper.map(prefectsDTO , PrefectEntity.class));
    }

    @Override
    public void updatePrefect(PrefectsDTO prefectsDTO) {
        repositery.save(mapper.map(prefectsDTO , PrefectEntity.class));
    }

    @Override
    public void deletePrefect(Integer id) {
        repositery.deleteById(id);
    }

    @Override
    public PrefectsDTO searchById(Integer id) {
        PrefectEntity prefectEntity = repositery.findById(id).get();
        PrefectsDTO prefectDTO = mapper.map(prefectEntity, PrefectsDTO.class);
        return prefectDTO;
    }

    @Override
    public List<PrefectsDTO> getAllPrefects() {
        List<PrefectEntity> prefectEntities = repositery.findAll();
        ArrayList<PrefectsDTO> prefectsDTOArrayList = new ArrayList<>();
        prefectEntities.forEach(prefectEntity -> {
            PrefectsDTO prefectsDTO = mapper.map(prefectEntity, PrefectsDTO.class);
            prefectsDTOArrayList.add(prefectsDTO);
        });
        return prefectsDTOArrayList;
    }
}
