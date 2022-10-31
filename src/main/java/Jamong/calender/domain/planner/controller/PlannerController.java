package Jamong.calender.domain.planner.controller;

import Jamong.calender.domain.planner.dto.PlannerDto;
import Jamong.calender.domain.planner.service.PlannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequiredArgsConstructor
@RequestMapping("/planner")
public class PlannerController {

    @Autowired
    private final PlannerService plannerService;

    @GetMapping("/write")
    public String writePlannerForm() {
        return "planner/write";
    }

    @PostMapping("/write")
    public String writePlanner(String content) {
        PlannerDto plannerDto = new PlannerDto(content);
        return "redirect:write";
    }
}
