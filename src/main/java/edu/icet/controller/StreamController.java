package edu.icet.controller;

import edu.icet.model.dto.StreamDTO;
import edu.icet.service.StreamService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/streams")
@RequiredArgsConstructor
@Tag(name = "Stream Controller", description = "APIs for managing streams")
public class StreamController {

    final StreamService service;

    @PostMapping("/add")
    public void addStream(@RequestBody StreamDTO streamDTO){
        service.addStream(streamDTO);
    }

    @PutMapping("/update")
    public void updateStream(@RequestBody StreamDTO streamDTO){
        service.updateStream(streamDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteById(@PathVariable Integer id){
        service.deleteStream(id);
    }

    @GetMapping("/search-by-id/{id}")
    public StreamDTO searchById(@PathVariable Integer id){
        return service.searchById(id);
    }

    @GetMapping("/get-all")
    public List<StreamDTO> getAllStreams(){
        return service.getAllStreams();
    }

}
