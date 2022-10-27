package javaTeam.calender.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name="member_table")
public class Member {

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
