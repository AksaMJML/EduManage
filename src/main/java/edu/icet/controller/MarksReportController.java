package edu.icet.controller;

import edu.icet.model.dto.MarksReportDTO;
import edu.icet.service.MarksReportService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marksReport")
@RequiredArgsConstructor
@Tag(name = "Marks Report Controller", description = "APIs for managing marks reports")
public class MarksReportController {

    final MarksReportService service;

    @PostMapping("/add")
    public void addMarksReport(MarksReportDTO marksReportDTO) {
        service.addMarksReport(marksReportDTO);
    }
}
