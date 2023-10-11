package com.dutaduta.sketchme.review.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class DeleteReviewApi {
    @DeleteMapping("/review")
    public ResponseEntity<ResponseFormat<String>> deleteReview(@RequestBody Map<String, Long> reviewMap, HttpServletRequest request) {
        return null;
    }
}
