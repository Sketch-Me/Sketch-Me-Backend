package com.dutaduta.sketchme.user.adapter.in.api;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequiredArgsConstructor
public class ModifyUserInfoApi {
    @PutMapping("/user/info")
    public ResponseEntity<?> modifyUserInformation(@RequestBody Map<String, String> nicknameMap, HttpServletRequest request) {
        return null;
    }
}
