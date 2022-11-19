package jamong.calendo.service;

import jamong.calendo.dto.request.TodoRequest;
import jamong.calendo.entity.Planner;
import jamong.calendo.exception.collection.BadRequestException;
import jamong.calendo.repository.PlannerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlannerServiceImpl implements PlannerService{

    private final PlannerRepository plannerRepository;

    @Override
    public Planner writePlanner(TodoRequest request) {
        Planner savePlanner = plannerRepository.save(Planner.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .build());
        return savePlanner;
    }

    @Override
    public Planner searchById(Long id) {
        return plannerRepository.findById(id).orElseThrow(
                () -> new BadRequestException(HttpStatus.NOT_FOUND.toString()));
    }

    @Override
    public List<Planner> searchAll() {
        return plannerRepository.findAll();
    }

    @Override
    public Planner updatePlanner(Long id, TodoRequest request) {
        Planner findPlanner = this.searchById(id);
        if(findPlanner.getTitle() != null) {
            findPlanner.setTitle(request.getTitle());
        }
        if(findPlanner.getContent() != null) {
            findPlanner.setContent(request.getContent());
        }

        return plannerRepository.save(findPlanner);
    }

    @Override
    public void deleteById(Long id) {
        plannerRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        plannerRepository.deleteAll();
    }
}
