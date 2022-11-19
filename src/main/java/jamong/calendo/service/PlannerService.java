package jamong.calendo.service;

import jamong.calendo.dto.request.TodoRequest;
import jamong.calendo.entity.Planner;

import java.util.List;

public interface PlannerService {
    Planner writePlanner(TodoRequest request);
    Planner searchById(Long id);
    List<Planner> searchAll();
    Planner updatePlanner(Long id, TodoRequest request);
    void deleteById(Long id);
    void deleteAll();
}
