package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LabAssistantDTO {
    private Integer id;
    private String name;
    private String email;
    private String phoneNumber;
    private String nic;
    private String address;
    private double salary;
    private Integer labId;
}
