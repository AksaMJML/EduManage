package edu.icet.controller;

import edu.icet.model.dto.TimeTableDTO;
import edu.icet.service.TimeTableService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/timetables")
@RequiredArgsConstructor
@Tag(name = "TimeTable Controller", description = "APIs for managing timetables")
public class TimeTableController {

    final TimeTableService service;

    @PostMapping("/add")
    public void addTimeTable(@RequestBody TimeTableDTO timeTableDTO){
        service.generateTimeTable(timeTableDTO);
    }

    @PutMapping("/update")
    public void updateTimeTable(@RequestBody TimeTableDTO timeTableDTO){
        service.updateTimeTable(timeTableDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public void deleteById(@PathVariable Integer id){
        service.deleteTimeTable(id);
    }

    @GetMapping("/search-by-id/{id}")
    public TimeTableDTO searchById(@PathVariable Integer id) {
        return service.searchById(id);
    }

    @GetMapping("/get-all")
    public List<TimeTableDTO> getAll(){
        return service.getAllTimeTables();
    }


}
