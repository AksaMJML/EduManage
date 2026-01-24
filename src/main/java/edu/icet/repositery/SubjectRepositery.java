package edu.icet.repositery;

import edu.icet.model.entity.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepositery extends JpaRepository<SubjectEntity, String> {
}
