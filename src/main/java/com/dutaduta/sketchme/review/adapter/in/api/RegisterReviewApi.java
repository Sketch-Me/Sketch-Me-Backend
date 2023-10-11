package com.dutaduta.sketchme.review.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import com.dutaduta.sketchme.review.adapter.in.api.dto.request.ReviewCreateRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegisterReviewApi {
    @PostMapping("api/meeting/{meetingId}/review")
    public ResponseEntity<ResponseFormat<Long>> registerReview(@Valid @RequestBody ReviewCreateRequest request, HttpServletRequest httpServletRequest, @PathVariable("meetingId") long meetingId) {
        return null;
    }
}
