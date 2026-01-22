package edu.icet.model.dto;

import edu.icet.util.Gender;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDTO {

    private Integer id;
    private String name;
    private int age;
    private String address;
    private int cityId; // Enum , table or api call
    private Gender gender;
    private int classId;
    private int clubId;
    private int libraryId;
    private int schoolId;
    private int achievementId;
    private int mediumId;
    private int reportId;
}
