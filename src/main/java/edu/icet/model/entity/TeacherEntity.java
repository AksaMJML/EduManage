package edu.icet.model.entity;

import edu.icet.util.Gender;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "Teacher")
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String nic;
    private String phone;
    private String email;
    private Date dob;
    private String address;
    private double salary;
    private int cityId;
    private Gender gender;
    private int streamId;
    private int categoryid;
    private String schoolId;
    private int studentId;
    private int departmentId;
    private int classId;
    private int libraryId;
    private int mediumId;
    private int timeTableId;
    private int statusId;
}
