package com.dutaduta.sketchme.product.adapter.in.api;

import com.dutaduta.sketchme.global.responseformat.ResponseFormat;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class SaveLivePictureApi {
    @PostMapping("/live-picture")
    public ResponseEntity<ResponseFormat<Object>> postLivePicture(@RequestParam("meetingId") Long meetingId, MultipartFile[] multipartFiles, HttpServletRequest request) {
        return null;
    }
}
