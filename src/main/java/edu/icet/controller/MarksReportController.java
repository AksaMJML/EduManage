package edu.icet.controller;

import edu.icet.model.dto.MarksReportDTO;
import edu.icet.service.MarksReportService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/marksReport")
@RequiredArgsConstructor
@Tag(name = "Marks Report Controller", description = "APIs for managing marks reports")
public class MarksReportController {

    final MarksReportService service;

    @PostMapping("/add")
    public void addMarksReport(@RequestBody MarksReportDTO marksReportDTO) {
        service.addMarksReport(marksReportDTO);
    }

    @PutMapping("/update")
    public void updateMarksReport(@RequestBody MarksReportDTO marksReportDTO) {
        service.updateMarksReport(marksReportDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMarksReport(@PathVariable Integer id) {
        service.deleteMarksReport(id);
    }


}
