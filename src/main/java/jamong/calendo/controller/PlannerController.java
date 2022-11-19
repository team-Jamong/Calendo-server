package jamong.calendo.controller;

import jamong.calendo.dto.request.WriteRequest;
import jamong.calendo.dto.response.WriteResponse;
import jamong.calendo.service.PlannerService;
import lombok.RequiredArgsConstructor;
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
    public WriteResponse write(@Validated @RequestBody WriteRequest request) {

        return null;
    }
}
