package Jamong.calender.domain.planner.service;

import Jamong.calender.domain.planner.dto.PlannerDto;
import Jamong.calender.domain.planner.entity.Planner;
import org.springframework.stereotype.Service;

@Service
public class PlannerService {

    public Integer writePlanner(PlannerDto plannerDto) {
        Planner planner = Planner.builder()
                .content(plannerDto.getContent())
                .member(plannerDto.getMember())
                .build();

        return planner.getPlanner_idx();
    }
}
