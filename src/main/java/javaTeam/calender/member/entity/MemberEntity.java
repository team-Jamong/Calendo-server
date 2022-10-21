package javaTeam.calender.member.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="member_table") // 테이블 명
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seq;

    @Column(nullable = false, unique = true, length = 255)
    private String memberId;

    @Column(nullable = false, unique = true, length = 255)
    private String memberPw;

    @Column(nullable = false, unique = true, length = 15)
    private String position;

    @Column(nullable = false, unique = true,length = 30)
    private String memberName;
}
