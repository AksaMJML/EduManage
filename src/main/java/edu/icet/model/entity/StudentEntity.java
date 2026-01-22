package edu.icet.model.entity;

import edu.icet.util.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private Integer cityId; // Enum , table or api call
    private Gender gender;
    private Integer classId;
    private Integer clubId;
    private Integer libraryId;
    private Integer schoolId;
    private Integer achievementId;
    private Integer mediumId;
    private Integer reportId;
}
