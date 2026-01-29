package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TimeTableDTO {
    private Integer id;
    private Integer classId;
    private Integer subjectId;
    private String day;
    private String startTime;
    private String endTime;
}
