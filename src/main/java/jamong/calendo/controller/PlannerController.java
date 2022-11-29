package jamong.calendo.controller;

import jamong.calendo.dto.request.TodoRequest;
import jamong.calendo.dto.response.TodoResponse;
import jamong.calendo.entity.Planner;
import jamong.calendo.service.PlannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/planner")
@RequiredArgsConstructor
public class PlannerController {

    private final PlannerService plannerService;

    @PostMapping("/write")
    public ResponseEntity<TodoResponse> write(@Validated @RequestBody TodoRequest request) {
        if(ObjectUtils.isEmpty(request.getTitle()))
            return ResponseEntity.badRequest().build();

        if(ObjectUtils.isEmpty(request.getContent()))
            return ResponseEntity.badRequest(

            ).build();

        Planner result = this.plannerService.writePlanner(request);
        return ResponseEntity.ok(new TodoResponse(result));
    }

    @GetMapping("{id}")
    public ResponseEntity<TodoResponse> searchById(@PathVariable Long id) {
        Planner result = plannerService.searchById(id);
        return ResponseEntity.ok(new TodoResponse(result));
    }

    @GetMapping
    public ResponseEntity<List<TodoResponse>> searchAll() {
        List<Planner> planners = plannerService.searchAll();
        List<TodoResponse> response = planners.stream().map(TodoResponse::new)
                .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }

    @PatchMapping("{id}")
    public ResponseEntity<Planner> update(@PathVariable Long id, @RequestBody TodoRequest request) {
        Planner result = plannerService.updatePlanner(id, request);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteOne(@PathVariable Long id) {
        plannerService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<?> deleteAll() {
        plannerService.deleteAll();
        return ResponseEntity.ok().build();
    }
}
