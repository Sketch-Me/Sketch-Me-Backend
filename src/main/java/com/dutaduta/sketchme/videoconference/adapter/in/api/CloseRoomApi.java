package com.dutaduta.sketchme.videoconference.adapter.in.api;


import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CloseRoomApi {
    @DeleteMapping("meeting/{meetingId}/videoconference/room")
    public ResponseEntity<ResponseFormat<Object>> closeRoom(@PathVariable("meetingId") long meetingId, HttpServletRequest request) {
        return null;
    }
}
