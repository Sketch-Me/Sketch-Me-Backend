package com.dutaduta.sketchme.videoconference.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import com.dutaduta.sketchme.videoconference.adapter.in.api.dto.response.ConnectionGetResponse;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OpenRoomApi {
    @GetMapping("meeting/{meetingId}/videoconference/get-into-room")
    public ResponseEntity<ResponseFormat<ConnectionGetResponse>> openRoom(@PathVariable("meetingId") long meetingId, HttpServletRequest request, @RequestParam("purpose") String purpose) {
        return null;
    }
}
