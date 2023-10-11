package com.dutaduta.sketchme.product.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import com.dutaduta.sketchme.product.adapter.in.api.dto.response.TimelapseGetResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class GetTimelapseApi {
    @GetMapping("/timelapse")
    public ResponseEntity<ResponseFormat<TimelapseGetResponse>> getTimelapse(@RequestParam("meetingId") Long meetingId, HttpServletRequest request) {
        return null;
    }
}
