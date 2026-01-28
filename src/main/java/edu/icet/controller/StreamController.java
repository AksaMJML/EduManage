package edu.icet.controller;

import edu.icet.model.dto.StreamDTO;
import edu.icet.service.StreamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/streams")
@RequiredArgsConstructor
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
}
