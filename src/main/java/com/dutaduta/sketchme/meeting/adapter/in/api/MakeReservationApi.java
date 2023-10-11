package com.dutaduta.sketchme.meeting.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import com.dutaduta.sketchme.meeting.adapter.in.api.dto.request.ReservationDTO;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MakeReservationApi {
    @PostMapping("/meeting")
    public ResponseEntity<ResponseFormat<Long>> makeReservation(
            @RequestBody ReservationDTO reservationDto,
            HttpServletRequest request
    ) {
        return null;
    }
}
