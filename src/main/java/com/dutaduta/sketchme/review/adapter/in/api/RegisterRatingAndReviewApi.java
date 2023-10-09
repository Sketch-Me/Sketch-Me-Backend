package com.dutaduta.sketchme.review.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import com.dutaduta.sketchme.review.adapter.in.api.dto.request.ReviewRegisterRequest;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegisterRatingAndReviewApi {
    @PostMapping("meeting/{meetingId}/rating-and-review")
    public ResponseEntity<ResponseFormat<Object>> registerRatingAndReview(@RequestBody ReviewRegisterRequest requestDTO, HttpServletRequest request) {
        return null;
    }
}
