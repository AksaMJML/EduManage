package edu.icet.repositery;

import edu.icet.model.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepositery extends JpaRepository<TeacherEntity, Integer> {
}
