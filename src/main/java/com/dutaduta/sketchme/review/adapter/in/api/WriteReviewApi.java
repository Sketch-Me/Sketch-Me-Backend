package com.dutaduta.sketchme.review.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import com.dutaduta.sketchme.review.adapter.in.api.dto.request.ReviewRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WriteReviewApi {
    @PostMapping("/review")
    public ResponseEntity<ResponseFormat<String>> writeReview(@RequestBody @Valid ReviewRequest reviewRequest, HttpServletRequest request) {
        return null;
    }
}
