package com.dutaduta.sketchme.user.adapter.in.api;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class GetUserProfileApi {
    @GetMapping("/user/profile")
    public ResponseEntity<?> getUserProfile(@RequestParam String member, HttpServletRequest request) {
        return null;
    }
}
