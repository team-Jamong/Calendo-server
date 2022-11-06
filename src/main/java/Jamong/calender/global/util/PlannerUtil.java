package Jamong.calender.global.util;

import Jamong.calender.domain.planner.dto.response.PlannerResponse;
import Jamong.calender.domain.planner.entity.Planner;

import java.util.Optional;

public class PlannerUtil {

    public PlannerResponse makePlannerResponse(Planner planner) {
        return new PlannerResponse(planner.getTitle(), planner.getContent());
    }

    public PlannerResponse makePlannerResponse(Optional<Planner> planner) {
        return new PlannerResponse(planner.get().getTitle(), planner.get().getContent());
    }

}
