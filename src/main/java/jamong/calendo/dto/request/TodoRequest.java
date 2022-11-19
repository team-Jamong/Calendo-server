package jamong.calendo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoRequest {

    @NotEmpty
    private String title;

    @NotEmpty
    private String content;

}
