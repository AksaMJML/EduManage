package edu.icet.service;

import edu.icet.model.dto.PrefectsDTO;

import java.util.List;

public interface PrefectService {
    void addPrefect(PrefectsDTO prefectsDTO);
    void updatePrefect(PrefectsDTO prefectsDTO);
    void deletePrefect(Integer id);
    PrefectsDTO searchById(Integer id);
    List<PrefectsDTO> getAllPrefects();
}
