package edu.icet.service.impl;

import edu.icet.model.dto.MarksReportDTO;
import edu.icet.model.entity.MarksReportEntity;
import edu.icet.repositery.MarksReportRepositery;
import edu.icet.service.MarksReportService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MarksReportServiceImpl implements MarksReportService {

    final MarksReportRepositery repositery;
    final ModelMapper mapper;

    @Override
    public void addMarksReport(MarksReportDTO marksReportDTO) {
        repositery.save(mapper.map(marksReportDTO , MarksReportEntity.class));
    }

    @Override
    public void updateMarksReport(MarksReportDTO marksReportDTO) {
        repositery.save(mapper.map(marksReportDTO , MarksReportEntity.class));
    }

    @Override
    public void deleteMarksReport(Integer id) {
        repositery.deleteById(id);
    }

    @Override
    public MarksReportDTO searchById(Integer id) {
        MarksReportEntity marksReportEntity = repositery.findById(id).get();
        MarksReportDTO marksReportDTO = mapper.map(marksReportEntity, MarksReportDTO.class);
        return marksReportDTO;
    }

    @Override
    public List<MarksReportDTO> getAllMarksReports() {
        return List.of();
    }
}
