package edu.icet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SchoolDTO {
    private String id;
    private String name;
    private String code;
    private String address;
    private String type;
    //private String medium;
    private String email;
    private String phone;
}
