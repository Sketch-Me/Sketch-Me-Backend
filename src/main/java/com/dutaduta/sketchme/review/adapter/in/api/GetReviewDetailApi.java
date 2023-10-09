package com.dutaduta.sketchme.review.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import com.dutaduta.sketchme.review.adapter.in.api.dto.response.ReviewDetailResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GetReviewDetailApi {
    @GetMapping("/review/detail/{id}")
    public ResponseEntity<ResponseFormat<ReviewDetailResponse>> getReviewDetail(@PathVariable Long id) {
        return null;
    }
}
