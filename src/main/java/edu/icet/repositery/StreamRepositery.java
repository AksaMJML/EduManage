package edu.icet.repositery;

import edu.icet.model.entity.StreamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreamRepositery extends JpaRepository<StreamEntity , Integer> {
}
