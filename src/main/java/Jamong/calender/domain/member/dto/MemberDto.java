package Jamong.calender.domain.member.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class MemberDto {

    private Integer member_idx;
    private String login_id;
    private String password;
    private String name;
}
