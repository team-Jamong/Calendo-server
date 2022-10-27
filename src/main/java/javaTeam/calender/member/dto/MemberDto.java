package javaTeam.calender.member.dto;

import javaTeam.calender.entity.Member;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDto {
    private Integer seq;
    private String memberId;
    private String memberPw;
    private String position;
    private String memberName;

    public MemberDto(Member member) {
        this.seq = member.getSeq();
        this.memberId = member.getMemberId();
        this.memberPw = member.getMemberPw();
        this.position = member.getPosition();
        this.memberName = member.getMemberName();
    }
}
