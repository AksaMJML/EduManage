package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LabDTO {
    private Integer id;
    private String type;
    private String time;
    private Date date;
    private Integer subjectId;
}
