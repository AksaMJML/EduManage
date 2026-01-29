package edu.icet.repositery;

import edu.icet.model.entity.TimeTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeTableRepositery extends JpaRepository<TimeTableEntity, Integer> {
}
