package com.dutaduta.sketchme.product.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MakeTimelapseApi {
    @PostMapping("/timelapse/new")
    public ResponseEntity<ResponseFormat<Object>> makeTimelapse(@RequestParam("meetingId") Long meetingId, HttpServletRequest request) {
        return null;
    }
}
