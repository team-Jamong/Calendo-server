package Jamong.calender.domain.member.entity;

import lombok.*;

import javax.persistence.*;

@Entity(name = "Member")
@Table(name = "member")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer member_idx;

    @Column(name = "login_id")
    private String login_id;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

}
