package edu.icet.controller;

import edu.icet.model.dto.TimeTableDTO;
import edu.icet.service.TimeTableService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/timetables")
@RequiredArgsConstructor
@Tag(name = "TimeTable Controller", description = "APIs for managing timetables")
public class TimeTableController {

    final TimeTableService service;

    @PostMapping("/add")
    public void addTimeTable(TimeTableDTO timeTableDTO){
        service.generateTimeTable(timeTableDTO);
    }

    @PutMapping("/update")
    public void updateTimeTable(TimeTableDTO timeTableDTO){
        service.updateTimeTable(timeTableDTO);
    }
}
