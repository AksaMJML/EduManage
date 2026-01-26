package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class PrefectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer prefectId;
    private String name;
    private String status;
    private int studentId;
}
