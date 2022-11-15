package Jamong.calender.domain.planner.controller;

import Jamong.calender.domain.planner.dto.request.PlannerRequest;
import Jamong.calender.domain.planner.dto.response.PlannerResponse;
import Jamong.calender.domain.planner.service.PlannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/planner")
public class PlannerController {

    private final PlannerService plannerService;

    @PostMapping("/write")
    public PlannerResponse writePlanner(@Validated PlannerRequest plannerRequest) {
        PlannerResponse plannerResponse = plannerService.writePlanner(plannerRequest);
        return plannerResponse;
    }

    @GetMapping("/delete/{title}")
    public PlannerResponse deletePlannerByTitle(@Validated @PathVariable String title) {
        PlannerResponse response = plannerService.deletePlannerByTitle(title);
        return response;
    }
}
