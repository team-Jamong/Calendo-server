package Jamong.calender.domain.planner.dto.response;


import lombok.*;

@Getter @Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlannerResponse {
    private String title;
    private String content;
}
