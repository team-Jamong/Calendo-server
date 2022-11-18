package jamong.calendo.service;

import jamong.calendo.dto.request.WriteRequest;
import jamong.calendo.dto.response.WriteResponse;
import jamong.calendo.entity.Planner;
import jamong.calendo.repository.PlannerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlannerServiceImpl implements PlannerService{

    private final PlannerRepository plannerRepository;

    @Override
    public WriteResponse writePlanner(WriteRequest writeRequest) {
        Planner savePlanner = plannerRepository.save(Planner.builder()
                .title(writeRequest.getTitle())
                .content(writeRequest.getContent())
                .build());
        return WriteResponse.builder()
                .title(writeRequest.getTitle())
                .content(writeRequest.getContent())
                .build();
    }


}
