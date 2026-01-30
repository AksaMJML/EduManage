package edu.icet.repositery;

import edu.icet.model.entity.LabEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabRepositery extends JpaRepository<LabEntity, Integer> {
}
