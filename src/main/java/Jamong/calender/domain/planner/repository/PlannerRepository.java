package Jamong.calender.domain.planner.repository;

import Jamong.calender.domain.planner.entity.Planner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlannerRepository extends JpaRepository<Planner, Integer> {
}
