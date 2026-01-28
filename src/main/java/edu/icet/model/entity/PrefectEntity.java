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
@Table(name = "Prefect")
public class PrefectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer prefectId;
    private String name;
    private String status;
    private int studentId;
}
