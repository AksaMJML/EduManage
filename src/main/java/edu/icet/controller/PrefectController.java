package edu.icet.controller;

import edu.icet.model.dto.PrefectsDTO;
import edu.icet.service.PrefectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/prefect")
public class PrefectController {

    final PrefectService service;

    @PostMapping("/add")
    public void addPrefect(PrefectsDTO prefectsDTO){
        service.addPrefect(prefectsDTO);
    }

    @PutMapping("/update")
    public void updatePrefect(PrefectsDTO prefectsDTO){
        service.updatePrefect(prefectsDTO);
    }

    @DeleteMapping("/delete")
    public void deletePrefect(Integer id){
        service.deletePrefect(id);
    }

    @GetMapping("/search-by-id/{id}")
    public PrefectsDTO searchById(Integer id){
       return service.searchById(id);
    }

    @GetMapping("/get-all")
    public List<PrefectsDTO> getAllPrefects(){
        return service.getAllPrefects();
    }
}
