package jamong.calendo.service;

import jamong.calendo.dto.request.WriteRequest;
import jamong.calendo.dto.response.WriteResponse;

public interface PlannerService {
    WriteResponse writePlanner(WriteRequest writeRequest);
}
