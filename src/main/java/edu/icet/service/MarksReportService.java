package edu.icet.service;

import edu.icet.model.dto.MarksReportDTO;

import java.util.List;

public interface MarksReportService {
    void addMarksReport(MarksReportDTO marksReportDTO);
    void updateMarksReport(MarksReportDTO marksReportDTO);
    void deleteMarksReport(Integer id);
    MarksReportDTO searchById(Integer id);
    List<MarksReportDTO> getAllMarksReports();
}
