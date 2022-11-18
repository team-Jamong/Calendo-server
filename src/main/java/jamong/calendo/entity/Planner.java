package jamong.calendo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
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
