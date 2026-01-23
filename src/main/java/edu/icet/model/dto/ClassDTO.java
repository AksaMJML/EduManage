package edu.icet.model.dto;

import lombok.Data;

@Data
public class ClassDTO {

    private Integer id;
    private int timeTableId;
    private int studentId;
    private int monitorId;
    private String code;
    private String name;
}
