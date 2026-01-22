package edu.icet.model.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class SchoolEntity {

    private String id;
    private String name;
    private String code;
    private String address;
    private String type;
    //private String medium;
    private String email;
    private String phone;
}
