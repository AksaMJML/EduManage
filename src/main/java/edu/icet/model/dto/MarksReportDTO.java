package edu.icet.model.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MarksReportDTO {
    private Integer reportId;
    private Integer studentId;
    private String studentName;
    private Double Marks;
}
