package edu.icet.repositery;

import edu.icet.model.entity.ClassEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepositery extends JpaRepository<ClassEntity, Integer> {
}
