package Jamong.calender.domain.planner.dto;

import Jamong.calender.domain.member.entity.Member;
import lombok.*;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PlannerDto {

    private Integer planner_idx;
    private String content;
    private Member member;

    public PlannerDto(String content) {
        this.content = content;
    }

}
