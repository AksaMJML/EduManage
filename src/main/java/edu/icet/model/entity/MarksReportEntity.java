package edu.icet.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "MarksReport")
public class MarksReportEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reportId;
    private Integer studentId;
    private String studentName;
    private Double Marks;
}
