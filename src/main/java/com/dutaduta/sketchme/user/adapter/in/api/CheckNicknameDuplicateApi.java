package com.dutaduta.sketchme.user.adapter.in.api;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CheckNicknameDuplicateApi {
    @GetMapping("/user/check/{nickname}")
    public ResponseEntity<?> checkNickname(@PathVariable String nickname) {
        return null;
    }
}
