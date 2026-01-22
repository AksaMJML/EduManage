package edu.icet.repositery;

import edu.icet.model.entity.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepositery extends JpaRepository<SchoolEntity, String> {
}
