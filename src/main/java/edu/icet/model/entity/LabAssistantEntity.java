package edu.icet.model.entity;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.boot.internal.Abstract;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "lab_assistants")
@Entity
public class LabAssistantEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String phoneNumber;
    private String nic;
    private String address;
    private double salary;
    private Integer labId;
}
