package Jamong.calender.domain.planner.dto.request;

import Jamong.calender.domain.planner.entity.Planner;
import Jamong.calender.domain.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlannerRequest {

    @NotNull
    private String title;

    @NotNull
    private String content;


    public Planner toEntity() {
        return Planner.builder()
                .content(content)
                .title(title)
                .build();
    }
}
