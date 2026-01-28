package edu.icet.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name = "Subject")
public class SubjectEntity {
    @Id

    private String id;
    private String name;
}
