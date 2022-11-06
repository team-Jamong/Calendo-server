package Jamong.calender.domain.planner.dto.request;

import Jamong.calender.domain.planner.entity.Planner;
import Jamong.calender.domain.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlannerRequest {
    private String content;

    private String title;
    private Member uuid;

    public Planner toEntity() {
        return Planner.builder()
                .content(content)
                .uuid(uuid)
                .title(title)
                .build();
    }
}
