package Jamong.calender.domain.planner.service;

import Jamong.calender.domain.planner.dto.request.PlannerRequest;
import Jamong.calender.domain.planner.dto.response.PlannerResponse;
import Jamong.calender.domain.planner.entity.Planner;
import Jamong.calender.domain.planner.repository.PlannerRepository;
import Jamong.calender.global.util.PlannerUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlannerService {

    private final PlannerRepository plannerRepository;
    private final PlannerUtil plannerUtil;

    // 플래너 등록하기
    public PlannerResponse writePlanner(PlannerRequest request) {
        Planner savePlanner = plannerRepository.save(request.toEntity());
        return PlannerResponse.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .build();
    }

    // 플래너 제목으로 불러오기
    public PlannerResponse readPlannerByTitle(String title) {
        Optional<Planner> findPlanner = plannerRepository.findByTitle(title);
        return PlannerResponse.builder()
                .title(findPlanner.get().getTitle())
                .content(findPlanner.get().getContent())
                .build();
    }

    // 플래너 삭제
    public PlannerResponse deletePlannerByTitle(String title) {
        Optional<Planner> findPlanner = plannerRepository.findByTitle(title);
        PlannerResponse response = new PlannerResponse(findPlanner.get().getTitle()
                , findPlanner.get().getContent());
        plannerRepository.deleteByTitle(title);
        return response;
    }

}
