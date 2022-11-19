package jamong.calendo.controller;

import jamong.calendo.dto.request.TodoRequest;
import jamong.calendo.dto.response.TodoResponse;
import jamong.calendo.entity.Planner;
import jamong.calendo.service.PlannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
            return ResponseEntity.badRequest().build();

        Planner result = this.plannerService.writePlanner(request);
        return ResponseEntity.ok(new TodoResponse(result));
    }
}
