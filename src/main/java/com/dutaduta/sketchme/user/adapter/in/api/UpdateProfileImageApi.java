package com.dutaduta.sketchme.user.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import com.dutaduta.sketchme.user.adapter.in.api.dto.response.ImgUrlResponse;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequiredArgsConstructor
public class UpdateProfileImageApi {
    @PutMapping("/user/profile-image")
    public ResponseEntity<ResponseFormat<ImgUrlResponse>> updateProfileImage(@RequestParam String member, MultipartFile uploadFile, HttpServletRequest request) {
        return null;
    }
}
