package jamong.calendo.dto.request;

import jamong.calendo.entity.Planner;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WriteRequest {
    private String title;
    private String content;

}
