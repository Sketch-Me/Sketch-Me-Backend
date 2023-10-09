package com.dutaduta.sketchme.meeting.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import com.dutaduta.sketchme.meeting.adapter.in.api.dto.response.MeetingInfoDTO;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GetMeetingInfoApi {
    @GetMapping("/meeting/{id}")
    public ResponseEntity<ResponseFormat<MeetingInfoDTO>> getMeetingInformation(
            @PathVariable Long id,
            HttpServletRequest request
    ) {
        return null;
    }
}
