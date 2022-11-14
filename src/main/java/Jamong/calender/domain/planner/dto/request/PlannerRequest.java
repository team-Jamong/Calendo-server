package Jamong.calender.domain.planner.dto.request;

import Jamong.calender.domain.planner.entity.Planner;
import Jamong.calender.domain.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlannerRequest {

    @NotEmpty(message = "플래너 내용은 공백이여선 안됩니다.")
    private String content;

    @NotEmpty(message = "플래너 제목은 공백이여선 안됩니다.")
    private String title;

    private Member memberId;

    public Planner toEntity() {
        return Planner.builder()
                .content(content)
                .title(title)
                .memberId(memberId)
                .build();
    }
}
