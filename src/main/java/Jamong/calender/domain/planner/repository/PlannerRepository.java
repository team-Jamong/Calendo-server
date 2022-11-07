package Jamong.calender.domain.planner.repository;

import Jamong.calender.domain.planner.entity.Planner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlannerRepository extends JpaRepository<Planner, Integer> {
    Optional<Planner> findByTitle(String title);
    void deleteByTitle(String title);
}
