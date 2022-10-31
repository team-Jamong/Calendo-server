package Jamong.calender.domain.planner.dto;

import Jamong.calender.domain.member.dto.MemberDto;
import lombok.*;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PlannerDto {

    private Integer planner_idx;
    private String content;
    private MemberDto memberDto;

    public PlannerDto(String content) {
        this.content = content;
    }
}
