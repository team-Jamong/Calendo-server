package jamong.calendo.dto.response;

import jamong.calendo.dto.request.TodoRequest;
import jamong.calendo.entity.Planner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoResponse {

    private Long id;
    private String title;
    private String content;
    private String url;

    public TodoResponse(Planner planner) {
        this.id = planner.getPlannerId();
        this.title = planner.getTitle();
        this.content = planner.getContent();

        this.url = "http://localhost:8080/" + this.id;
    }
}
