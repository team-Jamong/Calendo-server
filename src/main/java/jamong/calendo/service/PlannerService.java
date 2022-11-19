package jamong.calendo.service;

import jamong.calendo.dto.request.TodoRequest;
import jamong.calendo.dto.request.WriteRequest;
import jamong.calendo.dto.response.WriteResponse;
import jamong.calendo.entity.Planner;

import java.util.List;

public interface PlannerService {
    Planner writePlanner(WriteRequest writeRequest);
    Planner searchById(Long id);
    List<Planner> searchAll();
    Planner updatePlanner(Long id, TodoRequest request);
    void deleteById(Long id);
    void deleteAll();
}
