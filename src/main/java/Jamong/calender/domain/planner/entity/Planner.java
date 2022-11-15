package Jamong.calender.domain.planner.entity;

import Jamong.calender.domain.member.entity.Member;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Builder
@Table(name = "planner")
@AllArgsConstructor
@NoArgsConstructor
public class Planner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "planner_idx")
    private Integer plannerId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;


}
