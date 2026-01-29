package edu.icet.repositery;

import edu.icet.model.entity.MarksReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarksReportRepositery extends JpaRepository<MarksReportEntity , Integer> {
}
