package jamong.calendo.entity;

import lombok.*;

import javax.persistence.*;

@Entity @Setter
@Getter @Builder
@NoArgsConstructor
@AllArgsConstructor
public class Planner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "planner_id", nullable = false)
    private Long plannerId;

    @Column(name = "planner_title")
    private String title;

    @Column(name = "planner_content")
    private String content;

}
