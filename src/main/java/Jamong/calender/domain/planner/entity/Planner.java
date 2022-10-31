package Jamong.calender.domain.planner.entity;

import Jamong.calender.domain.member.entity.Member;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "planner")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Planner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "planner_idx", nullable = false)
    private Integer planner_idx;

    @Column(name = "content")
    private String content;

    @ManyToOne
    @JoinColumn(name = "member_idx")
    private Member member;
}
