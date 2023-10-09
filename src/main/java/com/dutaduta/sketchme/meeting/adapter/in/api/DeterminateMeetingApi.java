package com.dutaduta.sketchme.meeting.adapter.in.api;

import com.dutaduta.sketchme.meeting.adapter.in.api.dto.request.DeterminateMeetingRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DeterminateMeetingApi {
    @PutMapping("/meeting")
    public ResponseEntity<?> determinateMeeting(
            @RequestBody @Valid DeterminateMeetingRequest determinateMeetingRequest,
            HttpServletRequest request
    ) {
        return null;
    }
}
