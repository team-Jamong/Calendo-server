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
    private String uuid;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

}
