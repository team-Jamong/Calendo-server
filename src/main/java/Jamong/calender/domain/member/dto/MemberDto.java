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

    MemberDto(String login_id , String password , String name) {
        this.login_id = login_id;
        this.password = password;
        this.name = name;
    }

}
