package edu.icet.repositery;

import edu.icet.model.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepositery extends JpaRepository<DepartmentEntity, Integer> {
}
