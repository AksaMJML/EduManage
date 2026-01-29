package edu.icet.service.impl;

import edu.icet.model.dto.TimeTableDTO;
import edu.icet.model.entity.TimeTableEntity;
import edu.icet.repositery.TimeTableRepositery;
import edu.icet.service.TimeTableService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TimeTableServiceImpl implements TimeTableService {

    final TimeTableRepositery repositery;
    final ModelMapper mapper;

    @Override
    public void generateTimeTable(TimeTableDTO timeTableDTO) {
        repositery.save(mapper.map(timeTableDTO , TimeTableEntity.class));
    }

    @Override
    public void updateTimeTable(TimeTableDTO timeTableDTO) {
        repositery.save(mapper.map(timeTableDTO , TimeTableEntity.class));
    }

    @Override
    public void deleteTimeTable(Integer id) {

    }

    @Override
    public TimeTableDTO searchById(Integer id) {
        return null;
    }

    @Override
    public List<TimeTableDTO> getAllTimeTables() {
        return List.of();
    }
}
