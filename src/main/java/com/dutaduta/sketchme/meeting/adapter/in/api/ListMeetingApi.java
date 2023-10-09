package com.dutaduta.sketchme.meeting.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import com.dutaduta.sketchme.meeting.adapter.in.api.dto.response.MeetingInfoDTO;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class ListMeetingApi {
    @GetMapping("/meeting/list")
    public ResponseEntity<ResponseFormat<Map<String, List<MeetingInfoDTO>>>> getMyMeetingList(HttpServletRequest request) {
        return null;
    }
}
