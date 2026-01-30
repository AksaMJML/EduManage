package edu.icet.repositery;

import edu.icet.model.entity.LabAssistantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabAssistantRepositery extends JpaRepository<LabAssistantEntity , Integer> {
}
