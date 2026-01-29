package edu.icet.service;

import edu.icet.model.dto.TimeTableDTO;

import java.util.List;

public interface TimeTableService {
    void generateTimeTable(TimeTableDTO timeTableDTO);
    void updateTimeTable(TimeTableDTO timeTableDTO);
    void deleteTimeTable(Integer id);
    TimeTableDTO searchById(Integer  id);
    List<TimeTableDTO> getAllTimeTables();
}
